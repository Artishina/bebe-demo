package polly.springframework.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FortuneServiceImpl implements FortuneService {

    @Override
    public String getFortune() {
        return "It's your lucky day!";
    }
    
} 