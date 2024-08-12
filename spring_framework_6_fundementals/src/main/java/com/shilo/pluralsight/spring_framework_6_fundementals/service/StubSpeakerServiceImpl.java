package com.shilo.pluralsight.spring_framework_6_fundementals.service;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Speaker;
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.SpeakerRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wilso
 */

@RestController
public class StubSpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repo;

    public StubSpeakerServiceImpl(SpeakerRepository repo) {
        this.repo = repo;
    }
    
    
    @Override
    @GetMapping("/speakers")
    public List<Speaker> findAll(){
        return repo.findAll();
    }
    
}
