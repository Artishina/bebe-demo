package polly.springframework;

import org.springframework.context.annotation.Configuration;

import polly.springframework.Service.FortuneService;
import polly.springframework.Service.FortuneServiceImpl2;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;

@Configuration
@PropertySource("classpath:values.properties")
public class ConfigNoScan {

    @Bean
    public FortuneService fortuneService2() {
        return new FortuneServiceImpl2();
    }

    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach(fortuneService2());
    }
    
}