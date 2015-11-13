package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Boat implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean{

    private String color;
    private int age;

@Override
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    log.debug("beanFactory ; {} -> {} " ,beanFactory,"BeanFactoryAware setBeanFactory");
}

@Override
public void setBeanName(String name) {
    log.debug("name - {}  - >{}" ,name,"BeanNameAware setBeanName");
}

@Override
public void destroy() throws Exception {
    log.debug("{}" ," DisposableBean destroy");
}

@Override
public void afterPropertiesSet() throws Exception {
    log.debug("age : {} ,color : {} , -> {}" , age, color, "InitializingBean afterPropertiesSet");
}

}
