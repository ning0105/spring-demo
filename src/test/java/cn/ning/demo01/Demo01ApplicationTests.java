package cn.ning.demo01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo01ApplicationTests {
  @Autowired
  private ExecutorService testExecutor;
  private int i = 0;

  @Test
  void contextLoads() throws InterruptedException, ExecutionException, TimeoutException {
    for (int j = 0; j < 10; j++) {
      Future<Integer> result = testExecutor.submit(() -> {
        i++;
        System.out.println(Thread.currentThread().getName());
        return i;
      });
      System.out.println(result.get(10, TimeUnit.MILLISECONDS));
    }


//    System.out.println(i);
  }

}
