package pl.java.scalatech.scopeBehave;

import org.slf4j.Logger;

@FunctionalInterface
public interface Call {

  void printSpecific();

    default void print(Logger log) {
        log.info("created {}", this.getClass().getSimpleName());
    }
}
