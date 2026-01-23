package com.MultiThreading.Runnable;

public class BankAccount {
    private  Integer balance=100;

    public  Integer withdraw(int amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("reamainning bal: "+this.balance);
        }else {
            System.out.println("insufficient funds");
        }
        return this.balance;
    }
}
