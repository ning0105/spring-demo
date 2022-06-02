package cn.ning.demo01.config;

import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExecutorConfig {
  private static final int CORE_POOL_SIZE = 10;
  private static final int MAX_POOL_SIZE = 50;
  private static final int KEEP_ALIVE_SECONDS = 60;
  private static final LinkedBlockingQueue<Runnable> blockingQueue= new LinkedBlockingQueue<>(100);

  @Bean(value = "testExecutor")
  public ExecutorService threadPollTaskExecutor(){
    return new ThreadPoolExecutor(
        CORE_POOL_SIZE,
        MAX_POOL_SIZE,
        KEEP_ALIVE_SECONDS,
        TimeUnit.SECONDS, blockingQueue,
        new DefaultThreadFactory("my-thread")
    );
  }
}
