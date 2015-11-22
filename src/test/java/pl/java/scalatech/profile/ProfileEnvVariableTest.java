package pl.java.scalatech.profile;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProfileEnvVariableTest {

    private Oracle oracle;

    private Mysql mysql;

    @Test
    public void shouldProfileOracleWork() {
      // System.setProperty("spring.profiles.active", "oracle");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProfileConfig.class);
        String t = System.getProperty("spring.profiles.active");
        log.info("system : {}",t);
        Environment env = ctx.getBean(Environment.class);
        log.info("{}",env);
        oracle = ctx.getBean(Oracle.class);
        assertThat(oracle).isNotNull();

    }
}