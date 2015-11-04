package pl.java.scalatech.scopeBehave.config.aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.ItemRepo;
import pl.java.scalatech.scopeBehave.UserRepo;
import pl.java.scalatech.scopeBehave.config.singleton.StoreService;

@Configuration
@ComponentScan(basePackageClasses = { ItemRepo.class, UserRepo.class, StoreService.class })
@Slf4j
public class SingletonBehaveAwareConfig {

    @Bean
    public StoreService storeService(UserRepo userRepo, ItemRepo itemRepo) {
        return new StoreService(userRepo, itemRepo);
    }

}
