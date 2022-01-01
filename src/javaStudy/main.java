package javaStudy;

import javaStudy.java8.TestService;
import javaStudy.java8.Twr;

import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

                int poolSize = threadPoolExecutor.getPoolSize();
                String threadName = Thread.currentThread().getName();
                System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);

                int value = Integer.parseInt("숫자");
            }
        };

//      executorService.execute(runnable);
        executorService.submit(runnable);
        Thread.sleep(100);
        executorService.submit(runnable);
        Thread.sleep(100);
        executorService.submit(runnable);
        executorService.shutdown();

//    try(Twr t = new Twr()){
//      System.out.printf("test");
//    }
    }
}
