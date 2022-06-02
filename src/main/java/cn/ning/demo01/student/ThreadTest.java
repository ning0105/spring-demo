package cn.ning.demo01.student;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

public class ThreadTest {
  @Autowired
  private static Executor testExecutor;

  private static int i = 0;

  public static void main(String[] args) throws InterruptedException {
    int[] nums = new int[]{1,2,3,4,5};
    List<Integer> list = Arrays.stream(nums).boxed()
        .sorted((item1, item2) -> Integer.compare(item2, item1)).limit(3)
        .collect(Collectors.toList());

    list.forEach(System.out::println);

  }

}
