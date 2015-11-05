package pl.java.scalatech.postpre;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class TwoBean {
    public TwoBean(){
        log.info("+++ construct {}",this.getClass().getName());
    }
    
    @PostConstruct
    public void init(){
        log.info("+++  init :  {}",this.getClass().getName());
    }
    @PreDestroy
    public void destroy(){
        log.info("+++ destroy :  {}",this.getClass().getName());
    }
}
