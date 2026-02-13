package com.kovanlabs.intern.week.task.topicspractice;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        arr1.stream()
            .filter(x -> x%2 == 0 )
            .map(x -> x*x)
            .forEach(System.out::println);
    }
}
