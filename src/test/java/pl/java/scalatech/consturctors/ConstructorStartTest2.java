package pl.java.scalatech.consturctors;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.domain.collections.Item;
@Slf4j
public class ConstructorStartTest2 {

    @Test
    public void shouldItemCreate() {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructorStart2.xml");
       Item item =  context.getBean("item", Item.class);
       log.info("+++  {}",item);

       Item item2 =  context.getBean("item2",Item.class);
       log.info("+++  {}",item2);
    }

}
