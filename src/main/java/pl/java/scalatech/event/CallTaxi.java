package pl.java.scalatech.event;

import java.math.BigDecimal;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

public class CallTaxi extends ApplicationEvent{

    private static final long serialVersionUID = 5279409718013813970L;
    @Getter
    private String place;
    @Getter
    private BigDecimal salary;

    public CallTaxi(Object source,String place ,BigDecimal salary) {
        super(source);
        this.place = place;
        this.salary = salary;

    }



}
