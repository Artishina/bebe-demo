package polly.springframework;

public class App {

    public static void main(String args[]) {

        BaseballCoach coach = new BaseballCoach();

        System.out.println(coach.getDailyWorkout());

    }
    
}