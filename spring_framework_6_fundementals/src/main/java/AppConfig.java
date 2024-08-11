
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.SpeakerRepository;
import com.shilo.pluralsight.spring_framework_6_fundementals.repo.StubSpeakerRepositoryImpl;
import com.shilo.pluralsight.spring_framework_6_fundementals.service.SpeakerService;
import com.shilo.pluralsight.spring_framework_6_fundementals.service.StubSpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author wilso
 */

@Configuration
public class AppConfig {
    
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerService service = new StubSpeakerServiceImpl(getSpeakerRepository());
        return service;
    }
    
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new StubSpeakerRepositoryImpl();
    }
    
}
