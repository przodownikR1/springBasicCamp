package pl.java.scalatech.profile;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("oracle")
public class ProfileJavaTest {
    @Autowired
    private Oracle oracle;
    @Autowired(required = false)
    private Mysql mysql;

    @Test
    public void shouldProfileWork() {
        assertThat(oracle).isNotNull();
        assertThat(mysql).isNull();
    }
}
