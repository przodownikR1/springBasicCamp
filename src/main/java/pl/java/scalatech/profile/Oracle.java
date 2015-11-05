package pl.java.scalatech.profile;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
@Data
@Profile("oracle")
public class Oracle {
    @PostConstruct
    public void init(){
        log.info("oracle");
    }
    private String name;
}
