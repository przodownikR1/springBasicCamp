package pl.java.scalatech.messages;

import java.util.Locale;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:messagesConfig.xml")
public class MessageXmlTest {
    @Autowired
    private ApplicationContext context;
    @Test
    public void shouldMessagesWork(){
        String str = context.getMessage("hello", null, Locale.US);
        Assertions.assertThat(str).isEqualTo("hi");
        
        str = context.getMessage("hello", null, Locale.getDefault());
        Assertions.assertThat(str).isEqualTo("czesc");
        
    }
}