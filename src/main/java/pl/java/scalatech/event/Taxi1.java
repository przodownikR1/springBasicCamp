package pl.java.scalatech.event;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("taxi1")
@Slf4j
public class Taxi1 implements ApplicationListener<CallTaxi>{

    private BigDecimal threshold = BigDecimal.valueOf(new Random().nextInt(20));

    @Override
    public void onApplicationEvent(CallTaxi event) {

         log.info("taxi 1 : price {}  , place  {}",event.getSalary(),event.getPlace());

         if(threshold.compareTo(event.getSalary())<0) {
             log.info("jedziemy  taxi1 {} : price : {} ",threshold,event.getSalary() );
         }
    }

}
