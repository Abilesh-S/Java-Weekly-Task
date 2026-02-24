package com.kovanlabs.intern.week.task.day12generics;

import java.util.List;
import java.util.Stack;

class MyStack<T>{
    final Stack<T> list = new Stack<T>();
    public void push(T obj){
        list.push(obj);
    }
    public void pop( ){
        list.pop();
    }
    public T peek(){
        return list.peek();
    }
    public void display(){
        System.out.print("My Stack : ");
        for(T obj:list){
            System.out.print(obj+" ");
        }
    }
}

public class StackUsingGenerics {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.display();
        myStack.pop();
        System.out.println("\nAfter Popping");
        myStack.display();
        System.out.println("\nPeek Element : "+myStack.peek());

    }
}
