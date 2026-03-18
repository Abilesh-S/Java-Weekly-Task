package com.kovanlabs.intern.week.task.day4recursive;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

    private static int findFibonnaciBasedOnRange(int n){
        int[] fibonacciSeries = new int[n+1];
        Arrays.fill(fibonacciSeries,-1);
        if(n<=1){
            return 1;
        }
        if(fibonacciSeries[n]!=-1){
            return fibonacciSeries[n];
        }

        return fibonacciSeries[n]=findFibonnaciBasedOnRange(n-1)+findFibonnaciBasedOnRange(n-2);

    }

    public static void main(String[] args) {
        System.out.println("Enter no to be printed");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findFibonnaciBasedOnRange(n-1));
    }
}
