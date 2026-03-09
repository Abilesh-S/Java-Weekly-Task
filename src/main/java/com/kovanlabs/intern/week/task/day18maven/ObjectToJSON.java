package com.kovanlabs.intern.week.task.day18maven;

import com.google.gson.Gson;

abstract class Characther {
    protected int health;
    protected int strength;
    Characther(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }
    abstract void attack(Characther opponent);
    public boolean isAlive() {
        return health > 0;
    }
}

class Warrior extends Characther {
    Warrior() {
        super(120, 15); // High health, medium damage
    }
    @Override
    void attack(Characther opponent) {
        int damage = strength + (int) (Math.random() * 10);
        opponent.health -= damage;
        System.out.println("Warrior strikes for " + damage);
    }
}

public class ObjectToJSON {
    public static void main(String[] args) {
        Characther warrior = new Warrior();
        String obj = new Gson().toJson(warrior);
        System.out.println(obj);



    }

}
