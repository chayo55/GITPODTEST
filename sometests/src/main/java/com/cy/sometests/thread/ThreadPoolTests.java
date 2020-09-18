package com.cy.sometests.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolTests {

    public static void main(String[] args) {

        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(2);
        AtomicInteger atomicInteger = new AtomicInteger();
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "TEST--THREAD--"+atomicInteger.getAndIncrement()+"--");
            }
        };

        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,5,3000, TimeUnit.SECONDS, blockingQueue,threadFactory,handler);
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"RUNNABLE 1");
            try{Thread.sleep(30000);}catch (Exception e){};
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"RUNNABLE 2");
            try{Thread.sleep(3000);}catch (Exception e){};
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"RUNNABLE 3");
            try{Thread.sleep(3000);}catch (Exception e){};
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"RUNNABLE 4");
            try{Thread.sleep(3000);}catch (Exception e){};
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"RUNNABLE 5");
            try{Thread.sleep(3000);}catch (Exception e){};
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+"RUNNABLE 6");
            try{Thread.sleep(3000);}catch (Exception e){};
        });


    }
}
