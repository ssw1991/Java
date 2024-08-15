package com.shilo.pluralsight.spring_framework_6_fundementals.service;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Contact;
import java.util.List;

/**
 *
 * @author wilso
 */
public interface ContactServiceI {

    List<Contact> findAll();
    
}
