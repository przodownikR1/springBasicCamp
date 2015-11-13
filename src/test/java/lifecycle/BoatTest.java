package lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:boat.xml")
@Slf4j
public class BoatTest {

@Autowired
private Boat boat;

@Autowired
private Boat przodownikBoat;

@Test
public void shouldInitialize() {
 log.info("+++ {} ,{}",boat,przodownikBoat);
}

}
