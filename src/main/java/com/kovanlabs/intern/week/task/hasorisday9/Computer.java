package com.kovanlabs.intern.week.task.hasorisday9;

class Processor{
    Processor(int n){
        System.out.println("Computer has a Processor Level "+n);
    }
}
class Ram{
    Ram(int n){
        System.out.println("Computer has a Ram level "+n);
    }
}
class Storage{
    Storage(int n){
        System.out.println("Computer has a Storage Capacity "+n+" TB");
    }
}
public class Computer {
    private Processor processor;
    private Ram ram;
    private Storage storage;
    public Computer(int processorLevel , int ramLevel , int storageLevel){
        System.out.println("Computer has Assembled the parts");
        this.processor = new Processor(processorLevel);
        this.ram = new Ram(ramLevel);
        this.storage = new Storage(storageLevel);
    }
    void increaseRamCapacity(int n){
        this.ram = new Ram(n);
    }
    void increaseStorageCapacity(int n){
        this.storage = new Storage(n);
    }
    void increaseProcessorCapacity(int n){
        this.processor = new Processor(n);
    }
    public static void main(String[] args) {
        int processorLevel = 1;
        int ramLevel = 1;
        int storageLevel = 1;
        Computer computer = new Computer(processorLevel , ramLevel , storageLevel);
        computer.increaseRamCapacity(++ramLevel);
    }
}
