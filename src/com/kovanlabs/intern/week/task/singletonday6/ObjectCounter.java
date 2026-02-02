package com.kovanlabs.intern.week.task.singletonday6;

public class ObjectCounter {
    static int counter = 0;
    public ObjectCounters(){
        counter++;
    }
    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println("Static Variable "+counter);
    }

}
