package com.kovanlabs.intern.week.task.topicspractice;

@java.lang.FunctionalInterface
interface FunctionalInterfaceAdding{
    int add(int a, int b);
}

public class FunctionalInterface{

    public static void main(String[] args) {
        FunctionalInterfaceAdding f = (a,b) -> a+b;
        System.out.println(f.add(10, 20));
    }
}
