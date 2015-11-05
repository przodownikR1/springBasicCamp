package pl.java.scalatech.postpre;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PostPreConfig.class)
public class PostPreTest {

    @Test
    public void shouldPostProcessorWork(){
        
    }
    
}
