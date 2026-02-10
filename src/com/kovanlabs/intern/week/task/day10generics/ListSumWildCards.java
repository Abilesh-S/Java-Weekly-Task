package com.kovanlabs.intern.week.task.day10generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSumWildCards {
    private static void sumList(List<? extends Number> list){
        double sum=0;
        for(Number number : list){
            sum+=number.doubleValue();
        }
        System.out.println("Sum of "+list.size()+" Wild Cards : "+sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Double> doubleList = Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0);
        sumList(integerList);
        sumList(doubleList);
    }

}
