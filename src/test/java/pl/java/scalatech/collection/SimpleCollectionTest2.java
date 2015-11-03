package pl.java.scalatech.collection;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.domain.collections.Item;
@Slf4j
public class SimpleCollectionTest2 {

    @Test
    public void shouldItemCreate() {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collectionSolutionFactory.xml");
       Item item = context.getBean(Item.class);
       log.info("+++  {}",item);
    }
}
