package pl.java.scalatech.postpre;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages="pl.java.scalatech.postpre")
public class PostPreConfig {

  /*  @Bean
    @Order(1)
    @Description("example desc for third bean")
    public ThirdBean third(){
        return new ThirdBean();
    }*/
}
