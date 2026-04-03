package com.kovanlabs.intern.week.task.topicspractice;

class StaticMethodParent{
    static void display(){
        System.out.println("This is Parent Static Method");
    }
}

public class StaticMethodPractice extends StaticMethodParent {
    static String collegeName = "CIET";
    String studentName;
    static void display(){
        System.out.println("This is Child Static Method");
    }

    public static void main(String[] args){
        StaticMethodPractice smp = new StaticMethodPractice();
        smp.display();
        StaticMethodPractice smp2 = new StaticMethodPractice();
        System.out.println("College Name is "+collegeName);
        collegeName = "Hello";
        System.out.println("College Name is "+collegeName);

    }

}
