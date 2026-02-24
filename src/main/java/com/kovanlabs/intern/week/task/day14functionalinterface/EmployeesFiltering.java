package com.kovanlabs.intern.week.task.day14functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    String name , dept;
    int salary;
    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public String toString(){
        return this.name + " " + this.dept + " " + this.salary;
    }
}

class EmployeeFiltering{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Abilesh","IT",60000),
                new Employee("Thasneem","AI",50000),
                new Employee("Vignesh","IT",60000),
                new Employee("Priyaa","AI",50000)
        );
        Map<String , List<Employee>> groupingEmployees = employees.stream().collect(Collectors.groupingBy(emp -> emp.dept));
        groupingEmployees.forEach((k,v)->{System.out.println(k+" "+v);});
    }
}