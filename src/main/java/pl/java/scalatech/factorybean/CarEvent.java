package pl.java.scalatech.factorybean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarEvent implements EventSender {

    @Override
    public void print() {
        log.info("car +++");

    }

}
