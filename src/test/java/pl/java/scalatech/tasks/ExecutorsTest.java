package pl.java.scalatech.tasks;

import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.Executors.newSingleThreadExecutor;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.junit.Test;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.task.Task;
import pl.java.scalatech.task.TaskRun;

@Slf4j
public class ExecutorsTest {

    private Task task = new Task();
    private TaskRun rtask = new TaskRun();

    @Test
    @SneakyThrows
    public void shouldCacheThreadWork() {

        ExecutorService cachedThreadPoolExecutorService = newCachedThreadPool();
        if (cachedThreadPoolExecutorService.submit(task).get().equals("ok")) {
            log.info("The cachedThreadPoolExecutorService {}", new Date());
        }
    }

    @Test
    public void shouldFixedThreadWork() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        try {
            if (fixedThreadPool.submit(task).get().equals("ok")) {
                log.info("The fixedThreadPool has {}", new Date());
            }
        } catch (InterruptedException | ExecutionException e) {

        }
    }

    @Test
    public void shouldSingleThreadWork() {
        ExecutorService singleThreadExecutorService = newSingleThreadExecutor();
        try {
            if ("ok".equals(singleThreadExecutorService.submit(task).get())) {
                log.info("The singleThreadExecutorService {}", new Date());
            }
        } catch (InterruptedException | ExecutionException e) {

        }

    }

    @Test
    public void shouldCachedThreadWork() {
        ExecutorService es = newCachedThreadPool();
        try {
            if (es.submit(rtask, Boolean.TRUE).get().equals(Boolean.TRUE)) {
                log.info("Task has finished!");
            }
        } catch (InterruptedException | ExecutionException e) {

        }

    }

    @Test
    public void shouldTimeeThreadWork() {
        ScheduledExecutorService scheduledThreadExecutorService = newScheduledThreadPool(10);
        try {
            if (scheduledThreadExecutorService.schedule(task, 30, SECONDS).get().equals("ok")) {
                log.info("The scheduledThreadExecutorService {}", new Date());
            }
        } catch (InterruptedException | ExecutionException e) {

        }

        scheduledThreadExecutorService.scheduleAtFixedRate(rtask, 0, 5, SECONDS);

    }

}
