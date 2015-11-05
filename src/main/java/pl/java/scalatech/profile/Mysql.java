package pl.java.scalatech.profile;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Component
@Profile("mysql")
@Slf4j
public class Mysql {
      @PostConstruct
    public void init(){
        log.info("mysql");
    }
    
    private String name;
    
}
