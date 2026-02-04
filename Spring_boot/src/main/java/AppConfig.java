import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "")
public class AppConfig {
    @Bean
    public Sim sim() {
        return new Airtel(); // Change to new Airtel()
    }

    @Bean(name = "jioBean")
    public Sim jio() {
        return new Jio();
    }
}