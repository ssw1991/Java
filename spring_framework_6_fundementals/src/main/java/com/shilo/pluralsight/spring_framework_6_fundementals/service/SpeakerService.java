package com.shilo.pluralsight.spring_framework_6_fundementals.service;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Speaker;
import java.util.List;

/**
 *
 * @author wilso
 */
public interface SpeakerService {

    List<Speaker> findAll();
    
}
