package pl.java.scalatech.scopeBehave;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("item")
@Scope("prototype")
public class ItemRepo implements Call {
    @Override
    public void printSpecific() {
        print(log);
    }
    @PostConstruct
    public void init() {
        print(log);
    }
}
