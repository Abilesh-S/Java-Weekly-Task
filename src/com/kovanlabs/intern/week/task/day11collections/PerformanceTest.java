package com.kovanlabs.intern.week.task.day11collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTest {
    private void LinkedListPerformanceTest(){
        List<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 100000; i++){
            linkedList.add(i);
        }
        long start = System.nanoTime();
        int middleElements = linkedList.get(linkedList.size()/2);
        long end = System.nanoTime();
        double timeTakenToMilliSeconds = (end-start)/1000000;
        System.out.println("Time Taken for Linked list to find middle element "+(end-start));
    }
    private void ArrayListPerformanceTest(){
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 100000; i++){
            arrayList.add(i);
        }
        long start = System.nanoTime();
        int middleElements = arrayList.get(arrayList.size()/2);
        long end = System.nanoTime();
        System.out.println("Time Taken for Array list to find middle element "+(end-start));
    }
    public static void main(String[] args) {
        PerformanceTest performanceTest = new PerformanceTest();
        performanceTest.LinkedListPerformanceTest();
        performanceTest.ArrayListPerformanceTest();
    }
}
