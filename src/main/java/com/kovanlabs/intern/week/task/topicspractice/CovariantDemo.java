package com.kovanlabs.intern.week.task.topicspractice;
//Common Overriding Method
class Animal{
    void bark(){
        System.out.println("Animal Barking...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barking...");
    }

    void fetch(){
        System.out.println("Dog Fetching...");
    }
}

//Without Covariant REturn Types
class ParentWithoutCovariant {
    Animal getPet(){
        System.out.println("ParentWithoutCovariant ");
        return new Animal();
    }
}
class ChildWithoutCovariant extends ParentWithoutCovariant {
    Animal getPet(){
        System.out.println("ChildWithoutCovariant ");
        return new Dog();
    }

}

//WIth Covariant
class ParentWithCovariant  {
    Animal getPet(){
        System.out.println("ParentWithCovariant ");
        return new Animal();
    }
}
class ChildWithCovariant extends ParentWithCovariant {
    Dog getPet(){
        System.out.println("ChildWithCovariant ");
        return new Dog();
    }
}


public class CovariantDemo {
    public static void main(String[] args){
//        Without Covariant we need to type cast to print method other than overridenbelow is the eg
        ParentWithoutCovariant p1 = new ChildWithoutCovariant();
        Animal a1 = p1.getPet();
        a1.bark();
        Dog d2 = (Dog) a1;
        d2.fetch();

//      With Covariant we can directly access specific type of method from the subclasses
        ChildWithCovariant p2 = new ChildWithCovariant();
        Dog d1 = p2.getPet();
        d1.bark();
        d1.fetch();

    }

}
