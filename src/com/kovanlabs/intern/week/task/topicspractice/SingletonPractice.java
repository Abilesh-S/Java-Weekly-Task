package com.kovanlabs.intern.week.task.topicspractice;

class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Constructor Called");
    }
    public static synchronized Singleton getInstance(){
        Singleton localinstance =instance;
        if(localinstance == null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class SingletonPractice {
    public static void main(String[] args) {
        Runnable task = () ->{
            Singleton singleton = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " ->" + singleton.hashCode());
        };

        Thread t1 = new Thread(task , "Thread 1");
        Thread t2 = new Thread(task , "Thread 2");

        t1.start();
        t2.start();
    }
}
