package pl.java.scalatech.scopeBehave.config.singleton;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.Call;
import pl.java.scalatech.scopeBehave.ItemRepo;

@Service("storeService")
@RequiredArgsConstructor
@Data
@Slf4j
@ToString
public class StoreService implements ApplicationContextAware{

private ApplicationContext context;


private final @NonNull Call userRepo;
private final @NonNull Call itemRepo;

@PostConstruct
public void init() {
    log.info("created {}",this.getClass().getName());
}

public void doSomethingWithItemRepo() {
     log.info("+++ doSomethingWithRepo...start");
     ItemRepo repo = context.getBean(ItemRepo.class);
     repo.print(log, repo);
     log.info("+++ doSomethingWithRepo...end");

}

public void useRepo() {
    log.info("+++ use repos");
    this.userRepo.print(log,itemRepo.hashCode());
    this.itemRepo.print(log,itemRepo.hashCode());
    }

@Override
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

  this.context = applicationContext;

}

}
