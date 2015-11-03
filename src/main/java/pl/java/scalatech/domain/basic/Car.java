package pl.java.scalatech.domain.basic;

public class Car {  //Car class controls the creation of the engine

    private Engine engine;
    
    public Car(){
        engine = new Engine(); //tight coupling 
    }
    
}
