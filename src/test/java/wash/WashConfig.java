package wash;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses= {Body.class,CarWash.class,WashMachine.class})
public class WashConfig {

}
