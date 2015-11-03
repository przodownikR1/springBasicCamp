package pl.java.scalatech.consturctors;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.domain.collections.Item;
@Slf4j
public class ConstructorStartTest {

    @Test
    public void shouldItemCreate() {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructorStart.xml");
       Item item = context.getBean(Item.class);
       log.info("+++  {}",item);
    }

}
