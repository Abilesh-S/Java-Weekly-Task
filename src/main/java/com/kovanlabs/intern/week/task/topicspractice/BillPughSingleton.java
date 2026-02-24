package com.kovanlabs.intern.week.task.topicspractice;

class Singleton1{

    private Singleton1(){}

    private static class Helper{
        private static final Singleton1 instance = new Singleton1();
    }
    public static Singleton1 getInstance(){
        return Helper.instance;
    }
}

public class BillPughSingleton {

    public static void main(String[] args) {

        Runnable task = ()-> {
            Singleton1 instance = Singleton1.getInstance();
            System.out.println(Thread.currentThread().getName()+"->"+instance.hashCode());
        };

        Thread t1 = new Thread(task , "Thread 1");
        Thread t2 = new Thread(task , "Thread 2");

        t1.start();
        t2.start();

    }
}
