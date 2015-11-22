package pl.java.scalatech.converter;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:converter.xml")
@Slf4j
public class ConverterTEst {

    @Autowired
    private ApplicationContext app;
    @Autowired
    private ConversionService convert;
    @Autowired
    private Bean simpleBean;

    @Test
    public void test() {
        CustomerSSN customer = convert.convert("456-21-7890", CustomerSSN.class);
        log.info("ssn {}", customer);

    }
    @Test
    public void test3() {
        Bean simpleBean = app.getBean(Bean.class);
        log.info("ssn {}", simpleBean);
    }

    @Test
    public void test4() {
        log.info("ssn {}", simpleBean);
    }



    @Test
    public void test2() {

        GenericConversionService conversionService = new GenericConversionService();
        // testToArray(conversionService);

    }

    private static void testToArray(GenericConversionService conversionService) {

        String[] stringArray = conversionService.convert("One,Two,Three", String[].class);
        for (String element : stringArray) {
            log.info("Element is {}", element);
        }
    }

    private static void testToCollection(GenericConversionService conversionService) {

        @SuppressWarnings("unchecked")
        List<String> listOfStrings = conversionService.convert("One,Two,Three", List.class);
        for (String element : listOfStrings) {
            log.info("Element is  {}", element);
        }
    }

    private static void testToBoolean(GenericConversionService conversionService) {

        Boolean data = null;

        data = conversionService.convert("true", Boolean.class);
        log.info("Boolean value is {}", data);

        data = conversionService.convert("no", Boolean.class);
        log.info("Boolean value is {}", data);
    }

    private static void testToCharacter(GenericConversionService conversionService) {

        Character data = null;

        data = conversionService.convert("A", Character.class);
        log.info("Character value is {}", data);

        // data = conversionService.convert("Exception", Character.class);
        // log.info("Character value is " + data);
    }

    private static void testToNumber(GenericConversionService conversionService) {

        Integer intData = conversionService.convert("124", Integer.class);
        log.info("Integer value is {}", intData);

        Float floatData = conversionService.convert("215f", Float.class);
        log.info("Float value is {}", floatData);
    }

    private static void testToEnum(GenericConversionService conversionService) {

        TaskStatus taskStatus = conversionService.convert("PENDING", TaskStatus.class);
        log.info("Task Status is {}", taskStatus);
    }
}
