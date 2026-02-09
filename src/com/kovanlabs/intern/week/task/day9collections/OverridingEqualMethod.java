package com.kovanlabs.intern.week.task.day9collections;

import java.util.HashMap;
import java.util.Map;

class Person{
    int id ;
    String name;
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o ){
            return true;
        }

        if(!(o instanceof Person)){
            return false;
        }

        return this.id == ((Person)o).id && this.name.equals(((Person)o).name);
    }
    @Override
    public int hashCode(){
        return this.id;
    }
}

public class OverridingEqualMethod {

    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();

        Person person1 = new Person(1,"Abilesh");
        Person person2 = new Person(1,"Abilesh");

        map.put(person1,"Rockstar");
        map.put(person2,"Rockstar");

        if(map.get(person1).equals(map.get(person2))){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
        System.out.println("Hashcode value of p1 && p2 : "+(person1.hashCode() == person2.hashCode()));
    }
}
