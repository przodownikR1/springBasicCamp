package lifecycle;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class PostProcessorBoat implements InstantiationAwareBeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("bean {}, name {} , {}"," BeanPostProcessor postProcessBeforeInitialization");
        if ("boat".equalsIgnoreCase(beanName) && bean instanceof Boat) {
            Boat boat = (Boat) bean;
            boat.setColor("yellow");
            log.info("{}"," BeanPostProcessor postProcessBeforeInitialization ");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("bean : {} , beanName : {},  {}",bean,beanName," BeanPostProcessor postProcessAfterInitialization");
        if ("boat".equalsIgnoreCase(beanName) && bean instanceof Boat) {
            Boat boat = (Boat) bean;
            boat.setAge(11);
            log.info("{}"," BeanPostProcessor postProcessAfterInitialization ");
            return boat;
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("boat".equalsIgnoreCase(beanName) && beanClass == Boat.class) {
            log.info("beanClass : {}, beanName : {} - > {}",beanClass, beanName," InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("boat".equalsIgnoreCase(beanName) && bean instanceof Boat) {
            log.info("bean : {}  , beanName : {}  -> {}",bean,beanName,"InstantiationAwareBeanPostProcessor postProcessAfterInstantiation");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if ("boat".equalsIgnoreCase(beanName) && bean instanceof Boat) {
            log.info("psv : {}, pds: {} , bean :  {} beanName : {} -> {}",pvs,pds,bean,beanName," InstantiationAwareBeanPostProcessor postProcessPropertyValues");
        }
        return pvs;
    }
}
