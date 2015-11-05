package pl.java.scalatech.messages;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Answer {
    
    private String msg;
    
}
