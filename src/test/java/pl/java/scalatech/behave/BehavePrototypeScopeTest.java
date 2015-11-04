package pl.java.scalatech.behave;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.config.prototype.PrototypeBehaveConfig;
import pl.java.scalatech.scopeBehave.config.prototype.StorePrototypeService;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PrototypeBehaveConfig.class)
public class BehavePrototypeScopeTest {


    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void test() {
        log.info("start");
        StorePrototypeService ss = applicationContext.getBean(StorePrototypeService.class);
        StorePrototypeService ss2 = applicationContext.getBean(StorePrototypeService.class);

        log.info("prototype repoItem : {}",ss2.getItemRepo().hashCode());
        log.info("prototype repoItem : {}",ss.getItemRepo().hashCode());

        Assertions.assertThat(ss.getItemRepo()).isNotSameAs(ss2.getItemRepo());

        log.info("end");
    }


}