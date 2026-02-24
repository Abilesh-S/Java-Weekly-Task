package com.kovanlabs.intern.week.task.topicspractice;

public class CopyConstructor {
    int a , b;
    CopyConstructor(int a , int b) {
        this.a = a;
        this.b = b;
    }
    public CopyConstructor(CopyConstructor o) {
        this.a = o.a;
        this.b = o.b;
    }

    public static void main(String[] args) {
        CopyConstructor c = new CopyConstructor(10 ,20);
        System.out.println("Constructor value of a : "+c.a+" b : "+c.b);
        CopyConstructor c2 = new CopyConstructor(c);
        System.out.println("Copy Constructor value of a : "+c2.a+" b : "+c2.b);
    }

}
