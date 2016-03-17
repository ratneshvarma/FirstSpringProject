package spring.rat;

import com.sun.media.jfxmediaimpl.MediaDisposer;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.annotation.Annotation;
import java.util.List;

/**
 * Created by ratnesh on 14/3/16.
 */

public class Resturant implements InitializingBean, DisposableBean{

    public void greeting()
    {
        System.out.println("welcome tp resturant.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Going thru after property set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Been will destroy");
    }
   /* @PostConstruct
    public  void init()
    {
        System.out.println("init methot called.");
    }
    @PreDestroy
    public  void destroy()
    {
        System.out.println("destroyd method called");
    }
*/


}
