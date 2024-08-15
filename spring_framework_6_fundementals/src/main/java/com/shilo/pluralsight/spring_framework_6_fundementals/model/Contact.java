/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shilo.pluralsight.spring_framework_6_fundementals.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author wilso
 */

@Entity
@Table(name="contacts")
public class Contact {
    
    @Id
    private String email;
    
    @Column(nullable=false)
    private String firstName;
    
    @Column(nullable=false)
    private String lastName;
    
    @Column(nullable=true)
    private String phoneNumber;

    public Contact(){

    }
    
    public Contact(String email, String firstName, String lastName, String phoneNumber) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
