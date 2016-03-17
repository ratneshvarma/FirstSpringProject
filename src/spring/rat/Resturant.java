package spring.rat;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.annotation.Annotation;
import java.util.List;

/**
 * Created by ratnesh on 14/3/16.
 */

public class Resturant {

    public void greeting()
    {
        System.out.println("welcome tp resturant.");
    }
    @PostConstruct
    public  void init()
    {
        System.out.println("init methot called.");
    }
    @PreDestroy
    public  void destroy()
    {
        System.out.println("destroyd method called");
    }


}
