package pl.java.scalatech.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:profile.xml")
@ActiveProfiles("oracle")
public class ProfileXmlTest2 {
    @Autowired
    private Oracle oracle;
    @Autowired
    private Mysql mysql;
    
    @Test
    public void shouldProfileWork(){
        
    }
}
