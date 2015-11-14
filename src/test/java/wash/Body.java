package wash;

import org.springframework.stereotype.Component;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@ToString
public class Body implements Wash{

    @Override
    public void wash() {
  log.info("wash body");

    }

}
