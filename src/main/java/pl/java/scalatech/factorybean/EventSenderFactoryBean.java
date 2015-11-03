package pl.java.scalatech.factorybean;

import java.util.Random;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EventSenderFactoryBean implements FactoryBean<EventSender>, InitializingBean {

    public EventSenderFactoryBean() {
        log.info("Created EventSenderFactoryBean");
    }

    @Override
    public EventSender getObject() throws Exception {
        log.info("getObject method of EventSenderFactoryBean invoked");
        Random r = new Random();
        if (r.nextBoolean()) { return new BikeEvent(); }
        return new CarEvent();
    }

    @Override
    public Class<?> getObjectType() {
        return EventSender.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet method of EventSenderFactoryBean invoked");
    }

}