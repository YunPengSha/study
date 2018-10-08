package com.study.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class FutureTest {

  @Test
  public void A() throws ExecutionException, InterruptedException {
    Callable<String> callable = new Callable<String>() {
      public String call() throws Exception {
        Thread.sleep(5000);
        return "haha";
      }
    };
    FutureTask<String> future = new FutureTask<String>(callable);
    new Thread(future).start();
//    while (!future.isDone()) {
//      System.out.println("doing");
//    }
    if (!future.isDone()) {
      System.out.println("doing");
    }
    System.out.println(future.get());
    System.out.println("over");
  }


}
