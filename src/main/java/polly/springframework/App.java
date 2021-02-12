package polly.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());

        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);

        System.out.println(myTrackCoach.getDailyWorkout());

        TennisCoach tennisCoach = context.getBean("myTennisCoach", TennisCoach.class);

        System.out.println(tennisCoach.getDailyWorkout());

        System.out.println(tennisCoach.getDailyFortune());

        context.close();

        // read spring config java class
		AnnotationConfigApplicationContext contextNoXML = 
        new AnnotationConfigApplicationContext(Config.class);

        TennisCoach theCoachNoXML = contextNoXML.getBean("myTennisCoach", TennisCoach.class);

        System.out.println("theCoachNoXML " + theCoachNoXML.getDailyWorkout());

        System.out.println(theCoachNoXML.getDailyFortune());

        contextNoXML.close();

        AnnotationConfigApplicationContext contextNoScan = 
        new AnnotationConfigApplicationContext(ConfigNoScan.class);

        SwimCoach swimCoach = contextNoScan.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());   
        
        System.out.println(swimCoach.getEmail());     

        contextNoScan.close();

    }
}