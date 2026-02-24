package com.kovanlabs.intern.week.task.oopscollection.topicspractice.executorThreading;

import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduldedExecuitorServicePractice {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);
        System.out.println("Current Time "+Calendar.getInstance().get(Calendar.SECOND));

        for(int i = 0; i < 5; i++){
            scheduler.scheduleAtFixedRate(new Task(i),10,5-i , TimeUnit.SECONDS);

        }

       try{
           Thread.sleep(15000);
           scheduler.shutdown();
       }catch(InterruptedException e){
           e.printStackTrace();
       }
    }

}
class Task implements Runnable{

    int a;
    public Task(int a) {
        this.a = a;
    }
    @Override
    public void run() {
        System.out.println("Task " + a + " is running and current second "+Calendar.getInstance().get(Calendar.SECOND));
    }
}