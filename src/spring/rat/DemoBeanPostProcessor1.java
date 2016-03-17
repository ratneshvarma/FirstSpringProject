package spring.rat;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * Created by ratnesh on 18/3/16.
 */
public class DemoBeanPostProcessor1 implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Processing just befor been initialization1");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Processing just after been initialised1");
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
