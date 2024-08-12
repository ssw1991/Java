
package com.shilo.pluralsight.spring_framework_6_fundementals.repo;

import com.shilo.pluralsight.spring_framework_6_fundementals.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wilso
 */
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
     
}
