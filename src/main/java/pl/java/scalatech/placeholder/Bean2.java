package pl.java.scalatech.placeholder;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bean2 {

    
    private String text;
    @Value("${test2:slawek}")
    private String text2;
}
