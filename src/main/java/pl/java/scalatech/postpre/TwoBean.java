package pl.java.scalatech.postpre;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
//@Component
@Slf4j
public class TwoBean {
    public TwoBean(){
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
}
