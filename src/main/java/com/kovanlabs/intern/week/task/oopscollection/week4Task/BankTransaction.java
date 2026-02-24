package com.kovanlabs.intern.week.task.oopscollection.week4Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;


class Account{
    private double accountBalance;
    Account(double accountBalance){
        this.accountBalance = accountBalance;
    }
    public double getBalance(){
        return accountBalance;

    }
    public void deposit(double amount){
        accountBalance += amount;
    }

    public void withdraw(double amount){
        accountBalance -= amount;
    }
}

class TransactionEngine implements Runnable {
    private Account[] userList;
    TransactionEngine(Account[] account){
        this.userList=account;
    }
    @Override
    public void run() {
        int firstAccount = ThreadLocalRandom.current().nextInt(0, userList.length);
        int secondAccount = ThreadLocalRandom.current().nextInt(0, userList.length);
        if(firstAccount != secondAccount) {
            double amount = ThreadLocalRandom.current().nextDouble(100);
            transfer(firstAccount, secondAccount, amount);
        }



    }

    private void transfer(int firstAccount, int secondAccount, double amount){
        synchronized (userList[firstAccount]){
            synchronized (userList[secondAccount]){
                if(userList[firstAccount].getBalance() >= amount){
                    userList[firstAccount].withdraw(amount);
                    userList[secondAccount].deposit(amount);
                }
            }
        }
    }
}
public class BankTransaction{
    public static void main(String args[]){

        Account[] user = new Account[100];
        for(int i = 0 ; i < 100 ; i++) {
            user[i] = new Account(1000);
        }
        ExecutorService executor = Executors.newFixedThreadPool(20);
        for(int i = 0 ; i < 20 ; i++) {
            executor.execute(new TransactionEngine(user));
        }
        try{
            Thread.sleep(1000);
            executor.shutdown();
            double balance = 0;
            for(Account account : user){
                balance += account.getBalance();
            }
            System.out.println("Total Account Balance "+(int)balance);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }




    }
}
