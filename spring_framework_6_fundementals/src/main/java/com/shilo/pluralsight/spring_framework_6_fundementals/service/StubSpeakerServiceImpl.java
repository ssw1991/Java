package com.shilo.pluralsight.spring_framework_6_fundementals.service;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Speaker;
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.SpeakerRepository;
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.StubSpeakerRepositoryImpl;
import java.util.List;

/**
 *
 * @author wilso
 */
public class StubSpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repo = new StubSpeakerRepositoryImpl();

    public StubSpeakerServiceImpl(SpeakerRepository repo) {
        this.repo = repo;
    }
    
    @Override
    public List<Speaker> findAll(){
        return repo.findAll();
    }
    
}
