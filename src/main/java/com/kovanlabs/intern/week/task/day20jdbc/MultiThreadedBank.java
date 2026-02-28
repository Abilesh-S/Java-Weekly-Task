package com.kovanlabs.intern.week.task.day20jdbc;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public synchronized void credit(int amount) {
        balance += amount;
    }

    public synchronized void deposit(int amount) {
        balance -= amount;
    }

    public synchronized int getBalance() {
        return balance;
    }
}

public class MultiThreadedBank implements Runnable {

    static Bank[] account = new Bank[1000];

    Object lock;

    public MultiThreadedBank(Object lock) {
        this.lock = lock;
    }

    public void transaction() {
        Random random = new Random();

        int firstAccount = random.nextInt(1000);
        int secondAccount = random.nextInt(1000);

        if (firstAccount != secondAccount) {

            int amount = random.nextInt(500);

            Bank from = account[firstAccount];
            Bank to = account[secondAccount];

            // Lock both accounts (better than global lock)
            synchronized (from) {
                synchronized (to) {

                    if (from.getBalance() >= amount) {
                        from.deposit(amount);
                        to.credit(amount);
                    }
                }
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            transaction();
        }
    }

    public static void main(String[] args) {

        Object lock = new Object();

        // Initialize accounts
        for (int i = 0; i < 1000; i++) {
            account[i] = new Bank(1000);
        }

        ExecutorService transactionEngine = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; i++) {
            transactionEngine.execute(new MultiThreadedBank(lock));
        }
        transactionEngine.shutdown();

        while (!transactionEngine.isTerminated()) {
        }
        int total = 0;
        for (Bank b : account) {
            total += b.getBalance();
        }

        System.out.println("Total Money in Bank: " + total);
    }
}