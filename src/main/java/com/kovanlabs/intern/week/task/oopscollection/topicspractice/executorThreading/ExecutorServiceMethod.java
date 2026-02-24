package com.kovanlabs.intern.week.task.oopscollection.topicspractice.executorThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceMethod {

    public static void executorServiceAwaitTermination() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(()->
        {
            try{
                Thread.sleep(2000);
                System.out.println("Task 1 Completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executor.submit(()->
        {
            try{
                Thread.sleep(5000);
                System.out.println("Task 2 Completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executor.shutdown();
        try{
            boolean taskFinished = executor.awaitTermination(3, TimeUnit.SECONDS);
            if(taskFinished){
                System.out.println("All tasks finished within timeout");
            }
            else{
                System.out.println("All tasks not finished within timeout");
                executor.shutdownNow();

            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        executorServiceAwaitTermination();
    }

}
