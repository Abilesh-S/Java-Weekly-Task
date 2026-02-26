package com.kovanlabs.intern.week.task.topicspractice;

import java.lang.reflect.Array;
import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;
        list.add("hello");
        list.add("hi");
        list.add("Welcome");
        list.add("Tq");
        ListIterator<String> nameList = list.listIterator();

        System.out.println("Forward Process ");
        while(nameList.hasNext()){
            System.out.println(nameList.next());
        }

        nameList.add("Hero");
        System.out.println("Backward Process ");
        while(nameList.hasPrevious()){
            System.out.println(nameList.previous());
        }

        System.out.println("\nDisplaying the Iterator");
        while(nameList.hasNext()){
            System.out.println(nameList.next());
        }


    }
}
