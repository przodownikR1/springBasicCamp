package wash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {WashConfig.class})
@Slf4j
public class WashTest {
    @Autowired
    private WashMachine machine;

    @Test
    public void shouldAutowiredProperty() {
      log.info("{}",machine);
    }

}
