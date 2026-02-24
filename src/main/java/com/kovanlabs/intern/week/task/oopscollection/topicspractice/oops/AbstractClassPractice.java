package com.kovanlabs.intern.week.task.oopscollection.topicspractice.oops;

abstract class Shape{
    abstract void area();
    void display(){
        int radius = 5;
        System.out.println("Area of triangle is: " + radius*3);
    }
}

class Rectangle extends Shape{
    void area(){
        int l = 10 , b=20;
        System.out.println("Area of rectangle is: " + l*b);
    }
}

class Circle extends Shape{
    void area(){
        int r = 7;
        System.out.println("Area of circle is: " + r*r);
    }
}
class Triangle extends Shape{
    void area(){
        display();
    }
}


abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    void calculateSalary(){
        int salary = 50000;
        System.out.println("Salary is: " + salary);
    }
}
class PartTimeEmployee extends Employee {
    void calculateSalary(){
        int salary = 500;
        System.out.println("Salary is: " + salary);
    }
}

abstract class GameCharacther{
    abstract void attack();
}

class Warrior  extends GameCharacther{
    void attack(){
        System.out.println("Warrior attacks");
    }
}
class Mage extends GameCharacther{
    void attack(){
        System.out.println("Mage attacks");
    }
}


abstract class Person{
    String name , gender ;
    int age;
    Person(String name , int age , String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Students extends Person{
    Students(String name , int age , String gender) {
        super(name , age,  gender);
    }
    public String toString(){
        return super.name + " " + super.age + " " + super.gender ;
    }
}

public class AbstractClassPractice {

    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.area();
//        shape.area();
//        shape = new Circle();
//        shape.area();
//
//        Employee  employee = new FullTimeEmployee();
//        employee.calculateSalary();
//        employee = new PartTimeEmployee();
//        employee.calculateSalary();

        Students s = new Students("Abilesh",21 , "Male");
        System.out.println(s.toString());
    }
}
