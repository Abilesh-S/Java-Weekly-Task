package com.kovanlabs.intern.week.task.topicspractice;

@FunctionalInterface
interface Add{
    void add(int a,int b);
}

interface Square{
    int square(int a);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Add add =  (int a,int b)->{
           int sum  = a+b;
           System.out.println(sum);
        } ;
        add.add(1,2);
        Square s = a -> a*a;
        System.out.println(s.square(5));
    }
}
