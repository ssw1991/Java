
package com.shilo.pluralsight.spring_framework_6_fundementals.repo;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Speaker;
import java.util.List;

/**
 *
 * @author wilso
 */
public interface SpeakerRepository {

    List<Speaker> findAll();
    
}
