package spring.rat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ratnesh on 14/3/16.
 */
public class FistSpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Resturant resturant = (Resturant) context.getBean("resturantBean");
        resturant.setWelcomeNote("Welcome to Resturant.");
        resturant.greeting();
        Resturant resturant2 = (Resturant) context.getBean("resturantBean");
        resturant2.greeting();
    }
}
