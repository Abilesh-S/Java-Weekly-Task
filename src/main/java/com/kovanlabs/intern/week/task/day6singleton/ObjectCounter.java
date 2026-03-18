package com.kovanlabs.intern.week.task.day6singleton;

public class ObjectCounter {
    static int counter = 0;
    {
        counter++;
    }
    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        System.out.println("Static Variable "+counter);
    }

}
