package pl.java.scalatech.scopeBehave.config.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import pl.java.scalatech.scopeBehave.ItemRepo;
import pl.java.scalatech.scopeBehave.UserRepo;

@Configuration
@ComponentScan(basePackageClasses = { ItemRepo.class, UserRepo.class, StorePrototypeService.class })
public class PrototypeBehaveConfig {

    @Bean
    @Scope(value = "prototype")
    public StorePrototypeService storePrototypeService(UserRepo userRepo, ItemRepo itemRepo) {
        return new StorePrototypeService(userRepo, itemRepo);
    }
}
