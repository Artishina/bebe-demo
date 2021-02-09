package polly.springframework;

import polly.springframework.Service.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "30 mins run";
    }

    @Override 
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getEmail() {
        return "email";
    }

    public void init() {
        System.out.println("init");
    }
    
    public void destroy() {
        System.out.println("destroy");
    }

}