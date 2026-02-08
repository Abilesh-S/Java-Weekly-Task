package com.kovanlabs.intern.week.task.topicspractice;

public class LabelinJava {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++){
            one:{
                two:{
                    three:{
                        if(i == 0)
                            break one;
                        if(i == 2)
                            break two;
                        if(i == 1)
                            break three;
                    }System.out.println("Reached 4th Iteration");
                }System.out.println("Reached 2th Iteration");
            }System.out.println("Reached 3rd Iteration");
        }
    }
}
