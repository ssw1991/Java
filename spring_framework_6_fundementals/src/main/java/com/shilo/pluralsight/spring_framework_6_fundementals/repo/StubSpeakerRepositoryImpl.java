/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shilo.pluralsight.spring_framework_6_fundementals.repo;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Speaker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilso
 */
public class StubSpeakerRepositoryImpl implements SpeakerRepository {
    
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("first");
        speaker.setLastName("Hansen");
        speakers.add(speaker);
        return speakers;
    }
}
