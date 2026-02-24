package com.kovanlabs.intern.week.task.topicspractice;

import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int random = (int)(Math.random()*100);
        for (int i = 3; i >0; i--) {
            System.out.println("Enter you choice and you have "+i+" turns");
            int userGuessed = input.nextInt();
            if(userGuessed<random) {
                System.out.println("Less than the value");
            }
            else if(userGuessed>random) {
                System.out.println("Greater than the value");
            }
            else{
                System.out.println("You guessed");
                break;
            }

        }
        System.out.println("Random num is guessed "+random);
    }
}
