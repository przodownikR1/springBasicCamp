package pl.java.scalatech.postpre;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ThirdBean {
    public ThirdBean(){
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
