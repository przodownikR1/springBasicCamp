package pl.java.scalatech.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.domain.collections.Item;
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:collectionSolution.xml")
public class SimpleCollectionTest {

    @Value("#{item.shortcuts[1]}")
    private String s;

    @Value("#{item}")
    private Item it;

    @Value("#{item.goods != null ? item.goods['yamaha'] : 'frazer'}")
    private String bike;
    @Value("#{item.name?.toUpperCase()}")
    private String name;

    @Value("#{T(java.lang.Math).random()}")
    private double x;


    @Value("#{ systemProperties['user.name'] }")
    private String user;


    @Test
    public void shouldItemCreate() {
      // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collectionSolution.xml");
     //  Item item = context.getBean(Item.class);
       log.info("+++  {}",it);
       int random =1;
       log.info("user : {}",user);
       log.info("+++ {}  -> map :  {} , name = {}",s,bike,name);
       log.info("+++  random : {} ,   r -> {}",x,random);


    }
}
