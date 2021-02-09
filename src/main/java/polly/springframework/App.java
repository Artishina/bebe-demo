package polly.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());

        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);

        System.out.println(myTrackCoach.getDailyWorkout());

        context.close();
    }
}