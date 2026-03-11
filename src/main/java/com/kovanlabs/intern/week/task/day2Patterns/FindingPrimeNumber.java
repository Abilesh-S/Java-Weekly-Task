package com.kovanlabs.intern.week.task.day2Patterns;

import java.util.Arrays;

public class FindingPrimeNumber {
//  To create a boolean array only true values stored for prime number index
    private boolean[] primeBooleanArray(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i= 2; i*i <= n ;i++){
            if(prime[i]){
                for(int j = i*i ; j< n; j+=i){
                    prime[j]=false;
                }
            }
        }
        return prime;
    }
//  Add it in array and simultaneously print it
    private void primeNumber(boolean[] prime , int a){
        System.out.println("Prime Number");
        for(int i=2;i < a+1;i++){
            if(prime[i]){
                System.out.print(i+",");
            }
        }

    }

    public void sieveofEratosthenes(int a){
        boolean[] prime = primeBooleanArray(a);
        primeNumber(prime, a);

    }
    public static void main(String[] args) {
        FindingPrimeNumber fp = new FindingPrimeNumber();
        fp.sieveofEratosthenes(10);
    }
}
