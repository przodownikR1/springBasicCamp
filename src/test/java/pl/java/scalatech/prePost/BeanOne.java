package pl.java.scalatech.prePost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class BeanOne {
    @PostConstruct
    public void init() {
       log.info("postConstruct");
    }


    @PreDestroy
    public void release() {
        log.info("+++ predestroy");
    }
}
