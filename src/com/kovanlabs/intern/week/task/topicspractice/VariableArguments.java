package com.kovanlabs.intern.week.task.topicspractice;

public class VariableArguments {

    private void rainbowColors(String... color){
        System.out.println("Rainbow Color :");
        for(String i : color){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new VariableArguments().rainbowColors("Violet","Indigo","Blue","Green","Yellow","Orange","Red");
    }
}
