package com.kovanlabs.intern.week.task.day14functionalinterface;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerSummaryStatisticsTask {
    public static void main(String[] args) {
        Stream<Integer> random100Integers = Stream.generate(() -> Math.random()*200).limit(100).map(Double::intValue);
        IntStream intStream = random100Integers.mapToInt(Integer::intValue);
        IntSummaryStatistics stats = intStream.summaryStatistics();
        System.out.println("Maximum number in the Stream: " + stats.getMax());
        System.out.println("Minimum number in the Stream: " + stats.getMin());
        System.out.println("Sum of the numbers in the Stream: " + stats.getSum());
        System.out.println("Average of the numbers in the Stream: " + stats.getAverage());

    }
}
