package com.kovanlabs.intern.week.task.oopscollection.day17Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable {
    static int a = 1;
    Object task;
    public Task(Object task) {
        this.task = task;
    }

    @Override
    public  void run(){
        synchronized (task){
            try {
                System.out.println("Task is running and running thread name " + Thread.currentThread().getName() + " value : " + a);
                a++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class FixedThreadPoolTask {
    public static void main(String[] args) {
        Object lock = new Object();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        ThreadPoolExecutor pool =  (ThreadPoolExecutor) executor;

        for(int i = 0; i < 10; i++){
            pool.execute(new Task(lock));
        }

        executor.shutdown();

    }


}