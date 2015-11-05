package pl.java.scalatech.placeholder;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PlaceholderConverConfig.class)
public class PlaceholderConvertTest {

    @Autowired
    private PcBean2 pcBean2; 
    
    @Test
    public void shouldConvertWork(){
        log.info("birthDate {}",new SimpleDateFormat("yyyy-MM-dd").format(pcBean2.getBirthName()));
    }
    
}
