package polly.springframework;

import polly.springframework.Service.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "30 mins workout";
    }

    @Override 
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}