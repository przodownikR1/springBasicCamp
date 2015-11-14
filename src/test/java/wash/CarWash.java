package wash;

import org.springframework.stereotype.Component;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@WashTarget
@ToString
public class CarWash implements Wash{

    @Override
    public void wash() {
     log.info("car wash");

    }

}
