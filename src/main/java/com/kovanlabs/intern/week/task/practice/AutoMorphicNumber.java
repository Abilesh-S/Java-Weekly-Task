package com.kovanlabs.intern.week.task.practice;

public class AutoMorphicNumber {
    public static boolean autoMorphicNumber(int value){
        int temp = value*value;
        String v = Integer.toString(value);
        int len = v.length();
        int m = 1;
        for(int i = 0 ; i < len ; i++){
            m *= 10;
        }
        int n = temp%m;
        if(value == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int value = 7 ;
        System.out.println("It is Automorphic number "+autoMorphicNumber(value));
    }
}
