package pl.java.scalatech.profile;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProfileAppContextTest {

    private Oracle oracle;

    private Mysql mysql;

    @Test
    public void shouldProfileOracleWork() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("oracle");
        ctx.register(Oracle.class, Mysql.class);
        ctx.refresh();
        oracle = ctx.getBean(Oracle.class);
        assertThat(oracle).isNotNull();

    }

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void shouldProfileMysqlNotWork() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("oracle");
        ctx.register(Oracle.class, Mysql.class);
        ctx.refresh();
        mysql = ctx.getBean(Mysql.class);
        assertThat(mysql).isNull();
    }
}