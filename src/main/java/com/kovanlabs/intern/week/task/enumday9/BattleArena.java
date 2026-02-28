package main.java.com.kovanlabs.intern.week.task.enumday9;

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

/* ================= MAGE ================= */
class Mage extends Characther {
    Mage() {
        super(80, 25); // Low health, high damage
    }
    @Override
    void attack(Characther opponent) {
        int damage = strength + (int) (Math.random() * 20);
        opponent.health -= damage;
        System.out.println("Mage casts spell for " + damage);
    }
}

class Rogue extends Characther {
    Rogue() {
        super(100, 18);
    }
    @Override
    void attack(Characther opponent) {
        if (Math.random() < 0.3) { // 30% dodge chance
            System.out.println("Rogue dodged the attack!");
            return;
        }
        int damage = strength + (int) (Math.random() * 12);
        opponent.health -= damage;
        System.out.println("Rogue attacks for " + damage);
    }
}

public class BattleArena {

    public static void main(String[] args) {

        Characther player1 = new Warrior();
        Characther player2 = new Mage(); // change to Rogue to test

        System.out.println("Battle Begins️\n");

        while (player1.isAlive() && player2.isAlive()) {
            player1.attack(player2);
            if (!player2.isAlive()) break;
            player2.attack(player1);
            System.out.println("Player1 Health: " + player1.health);
            System.out.println("Player2 Health: " + player2.health);
            System.out.println("----------------------------------");
        }
        System.out.println("\n🏁 Battle Over!");
        if (player1.isAlive()) {
            System.out.println("Player 1 Wins!");
        }
        else {
            System.out.println("Player 2 Wins!");
        }
    }
}
