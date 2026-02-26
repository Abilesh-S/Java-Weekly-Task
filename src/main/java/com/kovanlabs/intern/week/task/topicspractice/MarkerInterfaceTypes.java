package com.kovanlabs.intern.week.task.topicspractice;



class CloneableType implements Cloneable{
    public void methodA(){
        System.out.println("Dhurandhar The Revenge");
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MarkerInterfaceTypes  {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableType cloneableType1 = new CloneableType();
        CloneableType cloneableType2 = (CloneableType) cloneableType1.clone();
        cloneableType2.methodA();
    }
}
