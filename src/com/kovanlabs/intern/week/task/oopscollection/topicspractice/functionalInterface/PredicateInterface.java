package com.kovanlabs.intern.week.task.oopscollection.topicspractice.functionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> even = x -> x % 2 == 0;
        Predicate<Integer> odd = x -> x % 2 != 0;
        System.out.println(even.test(10));
        System.out.println(even.and(odd).test(10));
        System.out.println(even.or(odd).test(10));
        System.out.println(even.negate().test(10));
        System.out.println();

    }
}
