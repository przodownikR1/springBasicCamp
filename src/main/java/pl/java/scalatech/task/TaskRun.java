package pl.java.scalatech.task;

import static java.lang.Thread.currentThread;
import static java.time.LocalTime.now;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TaskRun  implements Runnable {
        @Override
     public void run() {
           try {
              Thread.sleep(1000);
           } catch (InterruptedException e) {

           }
           log.info("thread name :  {}",currentThread().getName());
           log.info("time : {}", now().format(ISO_LOCAL_TIME));
        }

}
