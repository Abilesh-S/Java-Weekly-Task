package com.kovanlabs.intern.week.task.topicspractice;

public class Car {
    private PetrolEngine petrolEngine;
    public Car(PetrolEngine petrolEngine) {
        this.petrolEngine = petrolEngine;
    }
    public void run(){
        petrolEngine.start();
    }

    public static void main(String[] args) {
        PetrolEngine petrolEngine = new PetrolEngine();
        Car car = new Car(petrolEngine);
        car.run();
    }

}
