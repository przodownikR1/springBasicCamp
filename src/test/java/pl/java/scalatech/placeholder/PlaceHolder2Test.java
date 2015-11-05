package pl.java.scalatech.placeholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PlaceHolder2Config.class)
public class PlaceHolder2Test {

    
    @Autowired
    private Bean2 bean2;
    @Test
    public void shouldPopulateBean(){
        log.info("{}",bean2);
    }
}
