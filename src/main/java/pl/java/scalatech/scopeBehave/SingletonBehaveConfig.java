package pl.java.scalatech.scopeBehave;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses= {ItemRepo.class,UserRepo.class,StoreService.class})
public class SingletonBehaveConfig {



@Bean
public StoreService storeService(UserRepo userRepo, ItemRepo itemRepo) {
    return new StoreService(userRepo, itemRepo);
}


}
