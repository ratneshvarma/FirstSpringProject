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
        resturant.prepareHotDink();
    }
}
