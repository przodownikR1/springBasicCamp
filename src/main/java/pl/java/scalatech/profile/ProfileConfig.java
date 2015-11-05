package pl.java.scalatech.profile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses={Oracle.class,Mysql.class})
public class ProfileConfig {

}
