package com.kovanlabs.intern.week.task.topicspractice;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0 ;
        Predicate<Integer> isNegative = x -> x < 0 ;
        Predicate<Integer> isZero = x -> x == 0;
        int num =25;
        System.out.println("Given Num is positive "+isPositive.test(num));
        System.out.println("Given Num is negative "+isNegative.test(num));

        System.out.println("Given Number is Greater than Zero "+isZero.or(isPositive).test(num));
        System.out.println("Given number is equal to 25 or not = "+Predicate.isEqual(25).test(num));


    }
}
