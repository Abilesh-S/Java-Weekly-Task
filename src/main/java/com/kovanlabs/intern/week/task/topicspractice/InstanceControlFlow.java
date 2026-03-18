package com.kovanlabs.intern.week.task.topicspractice;

public class InstanceControlFlow {
    {
        System.out.println("Instance Method 1");
    }

    static{
        System.out.println("Static Method 1");
    }

    {
        System.out.println("Instance Method 2");
    }

    static {
        System.out.println("Static Method 2");
    }

    public static void main(String[] args) {
        InstanceControlFlow obj = new InstanceControlFlow();
        System.out.println("Main Method 1");
    }

}
