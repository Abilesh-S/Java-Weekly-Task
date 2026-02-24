package com.kovanlabs.intern.week.task.topicspractice;

import java.util.Scanner;

public class WrapperClassDemo {
    private float stringToInteger(String s) {
        return  Float.parseFloat(s);
    }
    private Integer primitivetoWrapperInteger(int i){
        return Integer.valueOf(i);
    }
    private int wrapperIntegerToPrimitiveint(Integer i){
        return i.intValue();
    }
    private String primitiveToWrapperString(int a ){
        return Integer.toString(a);
    }
    private Boolean stringToBoolean(String b){
        return Boolean.parseBoolean(b);
    }
    private String compareTwoPrimitiveObject(Integer a,Integer b){
        if(a>b){
            return "A is greater than B";
        }
        else if(a==b){
            return "A is Equal to B";
        }
        else{
            return "A is less than B";
        }
    }
    private int minValueInBothInteger(int a , int b){
        return Integer.min(a,b);
    }
    private int maxValueInBothInteger(int a , int b){
        return Integer.max(a,b);
    }
    private int sumValueInBothInteger(int a , int b){
        return Integer.sum(a,b);
    }
    private int compareTwoPrimitiveObjectUsingCompareMethod(Integer a,Integer b){
        return a.compareTo(b);
    }
    private boolean checkValueisNaN(double a){
        return Double.isNaN(a);
    }
    private boolean checkValueisInfinite(double a){
        return Double.isInfinite(a);
    }
    private int hashCodeValuetoInteger(String s){
        return Integer.decode(s);
    }
    public static void main(String[] args) {
        WrapperClassDemo w = new WrapperClassDemo();
        System.out.println(w.stringToInteger("250")+1);
        System.out.println(w.primitivetoWrapperInteger(2));
        System.out.println(w.wrapperIntegerToPrimitiveint(3));
        System.out.println(w.primitiveToWrapperString(4));
        System.out.println(w.compareTwoPrimitiveObject(10 , 20));
        System.out.println(w.minValueInBothInteger(10 ,20));
        System.out.println(w.maxValueInBothInteger(10 ,20));
        System.out.println(w.sumValueInBothInteger(10 ,20));
        System.out.println(w.compareTwoPrimitiveObjectUsingCompareMethod(10 , 10));
        System.out.println(w.checkValueisNaN(25.590));
        System.out.println(w.checkValueisInfinite(25.590));
        Double d = 0.0 / 0.0;
        System.out.println(Double.isNaN(d));
        System.out.println(w.hashCodeValuetoInteger("0x1A"));
        System.out.println(w.hashCodeValuetoInteger("010"));
        System.out.println(w.hashCodeValuetoInteger("0b1010"));
    }
}
