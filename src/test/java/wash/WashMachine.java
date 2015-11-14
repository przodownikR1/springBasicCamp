package wash;

import org.springframework.stereotype.Component;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
@ToString
public class WashMachine {
    @WashTarget
    private Wash washObject;


    public void info() {
       washObject.washInfo();
    }

}
