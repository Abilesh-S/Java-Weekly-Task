package com.kovanlabs.intern.week1.task.pattern;

public class FindingPrimeNumber {
//    To create a boolean array only true values stored for prime number index
    public boolean[] primeBooleanArray(int n){
        boolean[] prime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            prime[i]=true;
        }
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
    public void primeNumber(boolean[] prime , int a){
        System.out.println("Prime Number");
        for(int i=2;i < a+1;i++){
            if(prime[i]){
                System.out.print(i+",");
            }
        }

    }

    public void sieveofEratosthenes(int a){
        FindingPrimeNumber fp = new FindingPrimeNumber();
        boolean[] prime = fp.primeBooleanArray(a);
        fp.primeNumber(prime, a);

    }
    public static void main(String[] args) {
        new FindingPrimeNumber().sieveofEratosthenes(100);
    }
}
