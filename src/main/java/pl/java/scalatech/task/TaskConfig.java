package pl.java.scalatech.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
@Configuration
@EnableAsync
@EnableScheduling
public class TaskConfig {
   /* @Autowired
    private SimpleAsyncTaskExecutor asyncTaskExecutor;

    @Autowired
    private SyncTaskExecutor syncTaskExecutor;

    @Autowired
    private TaskExecutorAdapter taskExecutorAdapter;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Autowired
    private TaskRun task;

    public void submitJobs() {
       syncTaskExecutor.execute(task);
       taskExecutorAdapter.submit(task);
       asyncTaskExecutor.submit(task);
       //timerTaskExecutorWithoutScheduledTimerTasks.submit(task);


       for (int i = 0; i < 500; i++) {
        threadPoolTaskExecutor.submit(task);
    }

    }*/
}
