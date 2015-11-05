package pl.java.scalatech.messages;

import java.util.Locale;

import javax.annotation.Resource;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MessagesConfig.class)
public class MessageJavaTest {

    @Autowired
    private ApplicationContext context;
    
    @Resource(name = "messageSource")
    private MessageSource messageSource;
    @Autowired
    private Answer answer;
    
    @Test
    public void shouldMessagesWork(){
        String str = context.getMessage("hello", null, Locale.US);
        Assertions.assertThat(str).isEqualTo("hi");
        
        str = context.getMessage("hello", null, Locale.getDefault());
        Assertions.assertThat(str).isEqualTo("czesc");
        
        log.info("welcome : {}",str);
    }
    @Test
    public void shouldMessageSourceWork(){
        log.info("messageSource  hello => {} ",value());
    }
    
    @Test
    public void shouldMessageParamsSourceWork(){
        log.info("messageSource  hello => {} ",value(new String[]{"slawek","przodownik"}));
    }
    @Test
    public void shouldInjectByValueWork(){
        log.info("+++ value : {}",answer.getMsg());
    }
    
    private String value(String ... strs) {
        Locale locale = LocaleContextHolder.getLocale();    
        log.info("%%%   {}",strs);
        return messageSource.getMessage("helloParams", strs, locale);
    }
}
