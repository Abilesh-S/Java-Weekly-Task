package com.kovanlabs.intern.week.task.singletonday6;

public class ObjectCounter {
    static int counter = 0;
//  Instance 1
    {
        counter++;
    }
//  Instance 2
    {
        counter++;
    }
    public static void main(String[] args) {
        new ObjectCounter();
        System.out.println("Static Variable "+counter);
    }

}
