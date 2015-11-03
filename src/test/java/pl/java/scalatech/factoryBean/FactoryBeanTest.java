package pl.java.scalatech.factoryBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.factorybean.EventSender;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:factoryBeanTest.xml")
public class FactoryBeanTest {

    @Autowired
    private EventSender event;

    @Test
    public void shouldCreateEvent() {

        log.info("_++ {} ", event);

    }

}
