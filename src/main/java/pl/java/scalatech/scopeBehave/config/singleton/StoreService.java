package pl.java.scalatech.scopeBehave.config.singleton;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.Call;

@Service("storeService")
@RequiredArgsConstructor
@Data
@Slf4j
@ToString
public class StoreService {


private final @NonNull Call userRepo;
private final @NonNull Call itemRepo;

@PostConstruct
public void init() {
    log.info("created {}",this.getClass().getName());
}

public void useRepo() {
    log.info("+++ use repos");
    this.userRepo.print(log);
    this.userRepo.print(log);
}

}
