package com.kovanlabs.intern.week.task.topicspractice;

public class StackOverflowClass {
    public static int infiniteRecursivePrint(int n){
        System.out.println(n+" ");
        return n + infiniteRecursivePrint(n+1);
    }
    public static void main(String[] args) {
        StackOverflowClass.infiniteRecursivePrint(0);
    }
}
