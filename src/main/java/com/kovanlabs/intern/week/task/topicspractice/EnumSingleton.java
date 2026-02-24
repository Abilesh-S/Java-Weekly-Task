package com.kovanlabs.intern.week.task.topicspractice;

enum Singleton2 {
    INSTANCE;

    public void printMessage() {
        System.out.println("Hello World");
    }
}

public class EnumSingleton {

    public static void main(String[] args) {
        Singleton2.INSTANCE.printMessage();
    }

}
