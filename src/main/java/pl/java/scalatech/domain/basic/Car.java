package pl.java.scalatech.domain.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class Car {  

    private Engine engine;
    @Getter
    @Setter
    private String color;
    @Getter
    @Setter
    private int doors;
   
    @Autowired  //inject przez wlasnosc pole
    private User user;
    
    @Autowired //przez konstruktor jeśli @Autowired jest na konstruktorze
    public Car(Engine engine){
         this.engine = engine;        
    }
    
    public void run(){
        System.out.println("car :  " + engine);
    }
}
