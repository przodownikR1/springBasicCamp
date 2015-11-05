package pl.java.scalatech.event;

import java.math.BigDecimal;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
@Component
public class Client implements ApplicationEventPublisherAware{

    private ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
      this.publisher = applicationEventPublisher;
    }

public void callTaxi(String place, BigDecimal price) {
    CallTaxi ct = new CallTaxi(this,place,price);
    publisher.publishEvent(ct);
}

}
