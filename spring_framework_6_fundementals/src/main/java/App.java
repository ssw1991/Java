
import com.shilo.pluralsight.spring_framework_6_fundementals.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author wilso
 */
public class App {
    public static void main(String args[]){
        
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
