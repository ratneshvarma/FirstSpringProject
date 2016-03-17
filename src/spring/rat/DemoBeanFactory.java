package spring.rat;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by ratnesh on 18/3/16.
 */
public class DemoBeanFactory implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition=beanFactory.getBeanDefinition("resturantBean");
        MutablePropertyValues mutablePropertyValues= beanDefinition.getPropertyValues();
        mutablePropertyValues.addPropertyValue("welcomeNote","Hi All welcome to Our new Resturant");
    }
}
