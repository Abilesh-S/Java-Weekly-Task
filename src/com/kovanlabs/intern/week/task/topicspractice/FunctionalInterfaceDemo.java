package com.kovanlabs.intern.week.task.topicspractice;

interface Add extends Square{
    void add(int a, int b);
}

interface Square {
    int square(int a);
}

public class FunctionalInterfaceDemo implements Add{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public int square(int a) {
        return a*a;
    }
    public static void main(String[] args) {
        /*Add add =  (int a,int b)->{
           int sum  = a+b;
           System.out.println(sum);
        } ;
        add.add(1,2);
        Square s = a -> a*a;
        System.out.println(s.square(5));*/
        String s = "abi";

        s=s.replace("a", "b");
        System.out.println(s);
    }
}
