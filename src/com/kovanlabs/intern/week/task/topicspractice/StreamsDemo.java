package com.kovanlabs.intern.week.task.topicspractice;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//# 🟢 LEVEL 1 – BASIC (1–10)
//
//### 1️⃣ Print all elements of a list using Stream.
//
//### 2️⃣ Filter even numbers from a list of integers.
//
//### 3️⃣ Convert all strings in a list to uppercase.
//
//### 4️⃣ Count how many elements are greater than 50 in a list.
//
//### 5️⃣ Sort a list of integers using Stream.
//
//### 6️⃣ Remove duplicates from a list.
//
//### 7️⃣ Find the first element in a list.
//
//### 8️⃣ Check if any number is divisible by 7.
//
//### 9️⃣ Find maximum number in a list.
//
//### 🔟 Convert List<String> into single comma-separated String.
//
//---
//
//# 🟡 LEVEL 2 – INTERMEDIATE (11–20)
//
//Assume:
//
//```java
//class Employee {
//    String name;
//    int age;
//    double salary;
//    String department;
//}
//```
//
//### 1️⃣1️⃣ Get all employees whose salary > 50000.
//
//### 1️⃣2️⃣ Get list of employee names only.
//
//### 1️⃣3️⃣ Sort employees by salary (descending).
//
//### 1️⃣4️⃣ Find highest paid employee.
//
//### 1️⃣5️⃣ Group employees by department.
//
//### 1️⃣6️⃣ Count employees in each department.
//
//### 1️⃣7️⃣ Find average salary.
//
//### 1️⃣8️⃣ Find second highest salary.
//
//### 1️⃣9️⃣ Partition employees into age > 30 and <= 30.
//
//### 2️⃣0️⃣ Find employee names whose name starts with "A".
//
//---
//
//# 🔴 LEVEL 3 – ADVANCED (21–30)
//
//### 2️⃣1️⃣ Convert List<Employee> into Map<Department, List<Employee>>.
//
//### 2️⃣2️⃣ Convert List<Employee> into Map<String, Double> (name → salary).
//
//### 2️⃣3️⃣ Find department with highest total salary.
//
//### 2️⃣4️⃣ Flatten List<List<Integer>> into single list.
//
//### 2️⃣5️⃣ Remove duplicate employees based on name.
//
//### 2️⃣6️⃣ Find longest string in a list.
//
//### 2️⃣7️⃣ Find frequency of each element in list.
//
//### 2️⃣8️⃣ Find top 3 highest salaries.
//
//### 2️⃣9️⃣ Check if all employees belong to same department.
//
//### 3️⃣0️⃣ Given a sentence, find first non-repeating character using Streams.
//
//---
//
//# 🔥 BONUS (Very Important Interview)
//
//### ⭐ Reverse a string using Streams.
//
//### ⭐ Find duplicate elements in a list.
//
//### ⭐ Find first repeated number.
//
//### ⭐ Merge two lists and remove duplicates.
//
//---
//
//# 🚀 How to Practice (Important)
//
//For mastery:
//
//1. First solve using normal loops.
//2. Then solve using Streams.
//3. Then optimize.
//4. Then rewrite using method references.
//
//---
//
//Since you're preparing for backend roles, next I can:
//
//* ✅ Give answers for Level 1
//* ✅ Give full Employee dataset for testing
//* ✅ Give tricky stream debugging questions
//* ✅ Give real interview coding problems with Streams
//
//Tell me how you want to practice 🚀
class Employee{
    String name;
    int age;
    double salary;
    String  department;
    public Employee(String name, int age, double salary, String department){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}


class StreamsDemo{

    public static void filterEvenNumbers(List<Integer> list){
//      Using normal Loops
        for(Integer i:list){
            if(i%2==0){System.out.print(i+" ");}
        }
        System.out.println("\nAbove using for loops below using streams");
        list.stream().filter(x->x%2==0).forEach(x->System.out.print(x+" "));
    }

    public static void printList(List<Integer> list){
//      Using normal for loops
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println("\nAbove using for loop below using Streams");
//      Using Streams
        list.stream().forEach(x -> System.out.print(x+" "));

    }
    public static void uppercaseList(List<String> stringList){
        //      Using normal for loops
        for(String i:stringList){
            System.out.print(i.toUpperCase()+" ");
        }
        System.out.println("\nAbove using for loop below using Streams");
        stringList.stream().map(String::toUpperCase).forEach(x -> System.out.print(x+" "));
    }
    public static void greaterThan50(List<Integer> arr){
        //      Using normal for loops
        for(Integer i : arr){
            if(i>50){System.out.print(i+" ");}
        }
        System.out.println("\nAbove using for loop below using Streams");
        arr.stream().filter(x -> x>50).forEach(x -> System.out.print(x+" "));
    }

    public static void removeDuplicates(List<Integer> list){
        //      Using normal for loops
        Set<Integer> set = new HashSet<>(list);
        for(Integer i : set){
            System.out.print(i+" ");
        }
        System.out.println("\nAbove using for loop below using Streams");
        list.stream().distinct().forEach(x -> System.out.print(x+" "));
    }

    public static void divisibleBy7(List<Integer> list){
        for(Integer i : list){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nAbove using for loop below using Streams");
        list.stream().filter(x -> x%7==0).forEach(x -> System.out.print(x+" "));
    }

    public static void maximumNumberInAList(List<Integer> list){
//       Normal Approach
        int i = 1;
        int temp = list.get(0);
        while(list.size()-1>i){
            if(temp<list.get(i)){
                temp = list.get(i);
            }
            i++;
        }
        System.out.println(temp);
        System.out.println("\nAbove using for loop below using Streams");
        IntStream integerStream = list.stream().mapToInt(Integer::intValue);
        IntSummaryStatistics stats = integerStream.summaryStatistics();
        list.stream().max(Integer::compareTo).ifPresent(System.out::println);

    }

    public static void seperatedByCommand(List<String> stringList){
//      Normal For loop Approach
        StringBuilder strBuilder = new StringBuilder();
        for(String i:stringList){
            strBuilder.append(i).append(", ");
        }
        System.out.println(strBuilder);
        System.out.println("\nAbove using for loop below using Streams");
        stringList.stream().collect(Collectors.joining(","));
        System.out.println(stringList);
    }


    public static void main(String[] args) {
        System.out.println("1 . Easy Level");

        System.out.println("Normal List");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printList(list);

        System.out.println("\nEven List");
        filterEvenNumbers(list);

        System.out.println("\nStrings to Uppercase");
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
        uppercaseList(stringList);

        System.out.println("\nGreater than 50");
        List<Integer> arr =  Arrays.asList(10, 20, 30, 40, 40, 50, 60 ,70 , 90 ,60, 70, 80, 90, 100);
        greaterThan50(arr);

        System.out.println("\nRemove Duplicates");
        removeDuplicates(arr);

        System.out.println("\nDivisible By 7");
        divisibleBy7(arr);

        System.out.println("\nMaximum number in a list");
        maximumNumberInAList(arr);

        List<String> stringsList1 =  Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i");
        System.out.println("\nStrings seperated into a command as a single Command");
        seperatedByCommand(stringsList1);

//      Level 2 Operations

        List<Employee> employeeList = Arrays.asList(
                new Employee("Jagadeep",21 ,80000, "Mobile Mass Developer"),
                new Employee("Balaji" ,21 ,100000,"Shoulder Phonk"),
                new Employee("Vijay Balaji",21,70000,"Bank EMployee"),
                new Employee("Ranjith Kumar",21,50000,"Training Institute Mama"),
                new Employee("Sathish Kumar",21,100000,"QSpider adhuta Varisu"),
                new Employee("Tharun" ,21,60000,"Big Question Mark"),
                new Employee("Abilesh",21,90000,"Software Developer")
        );
    }
}