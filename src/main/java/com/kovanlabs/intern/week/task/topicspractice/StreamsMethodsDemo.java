package com.kovanlabs.intern.week.task.topicspractice;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;


public class StreamsMethodsDemo {

    public static void main(String[] args) {
//      Stream of Collection
        List<String> streamList1 = Arrays.asList("a","b","c");
        Stream<String> stringStream = streamList1.stream();


//      Stream Builder in java
        Stream<String> streamList2 = Stream.<String>builder().add("a").add("b").add("c").build();
//        streamList2.forEach(System.out::print);

        List<Integer> naturalNumbers = Arrays.asList(1 ,2, 3, 4,5,6,7,8,9,10);
        Stream<Integer> generatingValue = Stream.generate(() ->2).limit(11);
//        generatingValue.forEach(System.out::println);

        Stream<Integer> evenNumberUsingFilter = naturalNumbers.stream().filter(x -> x%2 ==0);
//        evenNumberUsingFilter.forEach(System.out::println);

        IntStream intValue = IntStream.range(1 ,10).filter(v -> v%2==0);
        intValue.forEach(System.out::println);

    }
}
