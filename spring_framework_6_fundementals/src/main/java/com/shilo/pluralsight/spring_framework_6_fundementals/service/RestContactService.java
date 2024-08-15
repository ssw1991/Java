/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shilo.pluralsight.spring_framework_6_fundementals.service;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Contact;
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.ContactRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wilso
 */
@RestController
public class RestContactService implements ContactServiceI {
     private ContactRepository repo;
   
     public RestContactService(ContactRepository repo) {
        this.repo = repo;
    }
     
    @Override
    @GetMapping("/API/contacts")
    public List<Contact> findAll(){
        return this.repo.findAll();
    }
    
}
