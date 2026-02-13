package com.kovanlabs.intern.week.task.topicspractice;

import java.util.function.Function;

public class FunctionInterfaceDemos {
    public static void main(String[] args) {
        Function<String, String> apple = x -> "Apple"+x;
        Function<String, String> sugar = x -> x+"Sugar";

        System.out.println(apple.apply("is Added"));
        System.out.println(apple.andThen(sugar).apply(" is Added and then "));
        System.out.println(apple.compose(sugar).apply("First Added "));

    }
}
