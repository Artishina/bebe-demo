package polly.springframework;

import org.springframework.stereotype.Component;

import polly.springframework.Service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("myTennisCoach")
@Scope("singleton")
public class TennisCoach {

   //@Resource(name="fortuneServiceImpl")
    @Autowired
    @Qualifier("fortuneServiceImpl")
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "play tennis";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    
}