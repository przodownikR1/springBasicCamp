package pl.java.scalatech.postpre;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//Instantiate->Populate properties-> BeanNameAware’s setBeanName()-> BeanFactoryAware’s setBeanFactory() -> ApplicationContextAware’s
//setApplicationContext() ->Pre-initialization  BeanPostProcessors -> InitializingBean ’s afterPropertiesSet() -> Call custom  init-method ->
//Post-initialization BeanPostProcessors -> Bean is  ready to use -> Container is  shutdown -> DisposableBean’s destroy() -> Call custom destroy-method

@Component("myFirstBean")
@Slf4j
public class OneBean implements BeanNameAware, BeanFactoryAware ,InitializingBean , ApplicationContextAware{
    
    public OneBean(){
        log.info("+++ construct {}",this.getClass().getSimpleName());
    }
    
    @PostConstruct
    public void init(){
        log.info("+++  init :  {}",this.getClass().getSimpleName());
    }
    @PreDestroy
    public void destroy(){
        log.info("+++ destroy :  {}",this.getClass().getSimpleName());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
          log.info("received the beanFactory  {}",beanFactory);
        
    }

    @Override
    public void setBeanName(String name) {
             log.info("setBean name : {}",name);
        
    }

    @Override
    public void afterPropertiesSet() throws Exception {
         log.info("+++ afterPropertiesSet()", this.getClass().getSimpleName());
        
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       log.info("+++ ApplicationContextAware");
        
    }
    
}
