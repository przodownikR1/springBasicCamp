package pl.java.scalatech.factorybean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BikeEvent implements EventSender {
    @Override
    public void print() {
        log.info("bike +++");

    }

}
