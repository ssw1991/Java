package com.shilo.pluralsight.spring_framework_6_fundementals;


import com.shilo.pluralsight.spring_framework_6_fundementals.model.Speaker;
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.SpeakerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author wilso
 */

@Configuration
public class AppConfig {
        
    @Bean
    CommandLineRunner initDatabase(SpeakerRepository repository) {

        return args -> {
            System.out.println("Preloading " + repository.save(new Speaker("John", "Smith")));
            System.out.println("Preloading " + repository.save(new Speaker("Jane", "Doe")));
        };
    }
    
}
