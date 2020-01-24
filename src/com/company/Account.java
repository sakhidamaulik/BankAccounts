package com.company;

public abstract class Account {
    protected double balance;

    public double getBalance(){
        return this.balance;
    }

    public abstract double deposit(double amount) throws Exception;
    public abstract double withdraw(double amount) throws Exception;

    public void printBalance(){
        System.out.println("Your total Balance: " + this.balance);
    }
}
