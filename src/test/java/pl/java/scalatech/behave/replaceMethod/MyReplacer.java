package pl.java.scalatech.behave.replaceMethod;

import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class MyReplacer implements MethodReplacer, ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;

    }

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        log.info("_+++  metoda klasy komp napisywanego przez reimplement : {}",method.getName());
        log.info("_+++  args w napisanej metodzie : {}",args);
        log.info("obiekt ktorego metoda jest nadpisywana : {}",obj);
        return context.getBean((String) args[0]);
    }

}
