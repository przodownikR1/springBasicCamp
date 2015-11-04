package pl.java.scalatech.scopeBehave.config.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.java.scalatech.scopeBehave.ItemRepo;
import pl.java.scalatech.scopeBehave.UserRepo;

@Configuration
@ComponentScan(basePackageClasses= {ItemRepo.class,UserRepo.class,StoreService.class})
public class SingletonBehaveConfig {



@Bean
public StoreService storeService(UserRepo userRepo, ItemRepo itemRepo) {
    return new StoreService(userRepo, itemRepo);
}


}
