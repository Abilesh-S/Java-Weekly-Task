package com.kovanlabs.intern.week.task.day19Junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    // Dummy opponent for testing
    class DummyEnemy extends Characther {
        DummyEnemy(int health, int strength) {
            super(health, strength);
        }

        @Override
        void attack(Characther opponent) {
            // Not needed for test
        }
    }

    @Test
    void attackShouldReduceOpponentHealth() {
        Warrior warrior = new Warrior();
        DummyEnemy enemy = new DummyEnemy(100, 10);

        int initialHealth = enemy.health;

        warrior.attack(enemy);

        assertTrue(enemy.health < initialHealth, "Enemy health should decrease after attack");
    }
    @Test
    void healthShouldNotGoBelowZero() {
        Warrior warrior = new Warrior();
        DummyEnemy enemy = new DummyEnemy(5, 10);

        warrior.attack(enemy);

    }

    @Test
    void warriorShouldStartAlive() {
        Warrior warrior = new Warrior();

        assertTrue(warrior.isAlive(), "Warrior should be alive at start");
    }
}