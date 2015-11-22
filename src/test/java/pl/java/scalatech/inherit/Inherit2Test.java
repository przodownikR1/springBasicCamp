package pl.java.scalatech.inherit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:inherit2.xml")
public class Inherit2Test {
    @Autowired
    private ComputerDepartment dept;
    @Test
    public void shouldInheritBeanWork() {
           log.info("{}",dept);
    }
}
