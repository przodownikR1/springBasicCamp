package pl.java.scalatech.behave.lookup;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.Call;
@Slf4j
public class CustomerRepo implements Call{

    @Override
    public void printSpecific() {
        print(log);
    }
    @PostConstruct
    public void init() {
        print(log);
    }


}
