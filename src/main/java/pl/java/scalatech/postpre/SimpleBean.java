package pl.java.scalatech.postpre;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class SimpleBean implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       log.info("++ before bean  {} , bean name {} ",bean,beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("++ after bean  {} , bean name {} ",bean,beanName);
        return bean;
    }

}
