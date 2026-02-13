package com.kovanlabs.intern.week.task.topicspractice;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClassDemo {
    private static void streamSourceOperation(){
        System.out.println("1 to 10 using collection Stream");
//        Collections Stream
        List<Integer> employees = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = employees.stream();
        stream.forEach(System.out::print);

        System.out.println("\nEven Numbers in array stream");
//        Array Stream
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).filter(x -> x % 2 == 0).forEach(System.out::print);

        System.out.println("\nOdd numbers in stream");
//        Creating stream directly
        Stream s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x -> x % 2 !=0);
        s.forEach(System.out::print);

        System.out.println("\nRandom Generation using stream");

        Stream s1 = Stream.generate(() -> Math.random()*200).limit(10).map(Double::intValue);
        s1.forEach(x->System.out.println(x));

        System.out.println("\nIterating using stream and performing power of 2 operation");

        Stream s2 = Stream.iterate(2 ,x -> x *2).limit(10);
        s2.forEach(x->System.out.print(x+" "));
    }
    private static void streamIntermediateOperation(){
        System.out.println("Strings to UpperCase");

        Stream<String> stream1 = Stream.of("Hello", "World","Vazthukal","Hello");
        stream1.map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\nRemove Duplicates");
        Stream<String> stream2 = Stream.of("Hello", "World","Vazthukal","Hello");
        stream2.distinct().forEach(System.out::println);

        System.out.println("\nDescending Order");
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream3.sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    private static void streamToCollectionList(){
        System.out.println("Strings to Collection List");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list ;
        stream.filter(x -> x % 2 == 0).map(x -> x*x).collect(Collectors.toList()).forEach(System.out::println);
    }
    private static void streamNameListToSortOrder(){
        System.out.println("UpperCase Name and in sorted order");

        List<String> employees = Arrays.asList("Abilesh","Paul Rajan","Mathan","Sakthi","Avengers","Udhaya","Vignesh");
        employees.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
//        streamSourceOperation();
//        streamIntermediateOperation();
        streamToCollectionList();
        streamNameListToSortOrder();
    }
}
