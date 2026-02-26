package com.kovanlabs.intern.week.task.oopscollection.day16Threads;


class CounterVariable extends Thread {
    volatile static int counter = 0;
    static synchronized void counterOperation(){
        counter++;
    }
}

public class RaceConditionThread {
    public static void main(String[] args) throws InterruptedException {
        CounterVariable counterClass = new CounterVariable();
        CounterVariable t1 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t2 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t3 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t4 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t5 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t6 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t7 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t8 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t9 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};
        CounterVariable t10 = new CounterVariable(){ @Override public void run(){for(int i = 0; i < 1000; i++){counterOperation();}}};

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
        System.out.println(counterClass.counter);

        System.out.println("Main Thread Executed");
    }
}
