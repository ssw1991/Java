package com.shilo.pluralsight.spring_framework_6_fundementals.service;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Contact;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.ContactRepository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author wilso
 */

@Controller
public class DefaultContactService implements ContactServiceI {
    
    private ContactRepository repo;

    public DefaultContactService(ContactRepository repo) {
        this.repo = repo;
    }
    
    
    @Override
    public List<Contact> findAll(){
        return repo.findAll();
    }
    
    @GetMapping("contact")
    public String getContacts(@ModelAttribute ("contact") Contact contact){
        return "contact";
    }
    
    @PostMapping("contact")
    public String addContact(@Valid @ModelAttribute ("contact") Contact contact, BindingResult br) {
        this.repo.save(contact);
        System.out.println("Contact: " + contact.getFirstName());
        return "redirect:contact";
    }
}
