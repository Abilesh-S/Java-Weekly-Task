package com.kovanlabs.intern.week.task.topicspractice;

interface Payment{
    void pay(float pay);
}
class CreditCard implements Payment{
    private float balance;
    CreditCard(float balance){
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    @Override
    public void pay(float pay) {
        if(pay>balance){
            System.out.println("Credit Card Payment Failed");
            return;
        }
        balance -= pay;
    }
}

class DebitCard implements Payment{
    private float balance;
    DebitCard(float balance){
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    @Override
    public void pay(float pay) {
        if(pay>balance){
            System.out.println("Credit Card Payment Failed");
            return;
        }
        balance -= pay;
    }
}

class Wallet implements Payment{
    private float balance;
    Wallet(float balance){
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    @Override
    public void pay(float pay) {
        if(pay>balance){
            System.out.println("Transaction amount is greater than balance");
        }
        else{
            balance -= pay;
        }
    }

}

class Application {
    public void makePayment(Payment payment,float amountDebited){
        payment.pay(amountDebited);
    }
}

public class PaymentGatewaySystem {
    public static void main(String[] args) {
        Application app = new Application();
        Wallet wallet = new Wallet(10000);
        DebitCard debit =new DebitCard(10000);
        CreditCard credit =new CreditCard(10000);
        System.out.println("Wallet Balance : "+wallet.getBalance());
        app.makePayment( wallet, 1000);
        System.out.println("Wallet Balance : "+(wallet.getBalance()));
    }
}
