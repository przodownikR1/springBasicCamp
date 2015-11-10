package pl.java.scalatech.task;

import static java.lang.Thread.currentThread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Task implements Callable<String> {
   @Override
public String call() {
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {

      }
      log.info("thread name :  {}",currentThread().getName());
      log.info("time : {}", LocalTime.now().format(DateTimeFormatter.ISO_TIME));
    return "ok";
   }

}