package pl.java.scalatech.scopeBehave;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("user")
public class UserRepo implements Call {

    @Override
    public void printSpecific() {
        print(log);
    }
    @PostConstruct
    public void init() {
        print(log);
    }
}
