package com.kovanlabs.intern.week.task.topicspractice;

class Reference{
    int b;
}

public class PassByValueandReference {
    int b = 20;
    public static void passByValue(int b){
        b = 25;
    }

    public static void passByReference(Reference r){
        r.b = 30;
    }

    public static void main(String[] args) {
        int b = 5 ;
        System.out.println("Before passing value "+b);
        passByValue(b);
        System.out.println("After passing value "+b);

        Reference r = new Reference();
        System.out.println("Before passing reference "+b);
        passByReference(r);
        System.out.println("After passing reference "+r.b);
    }
}
