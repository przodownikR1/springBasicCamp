package pl.java.scalatech.behave;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.config.singleton.SingletonBehaveConfig;
import pl.java.scalatech.scopeBehave.config.singleton.StoreService;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SingletonBehaveConfig.class)
public class BehaveScopeTest {


    @Autowired
    ApplicationContext applicationContext;
    @Test
    public void test() {
        log.info("start");
        StoreService ss = applicationContext.getBean(StoreService.class);
        StoreService ss2 = applicationContext.getBean(StoreService.class);

        log.info("prototype 1 : {}",ss2.getItemRepo());
        log.info("prototype 2 : {}",ss.getItemRepo());

        Assertions.assertThat(ss.getItemRepo()).isSameAs(ss2.getItemRepo());

        log.info("end");
    }


}