package com.kovanlabs.intern.week.task.inheritanceday7;

class Employee{
    final private String name;
    final private int age;
    final private String email;
    final private String address;
    Employee(String name, int age, String email, String address){
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee Details\n" + "name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + ", address='" + address ;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("Abilesh" , 20 , "abilesh1067@gmail.com","India");
        System.out.println(e1.toString());

    }
}
