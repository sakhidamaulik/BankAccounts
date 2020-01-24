package com.company;

public class PremiumSavingAccount extends  SavingAccount{
    public PremiumSavingAccount(double balance) {
        super(balance);
    }

    public double deposit(double amount) throws Exception{
        if(amount > 500000){
            throw new Exception("If your amount is greater than 5 lac needs approval from bank manager");
        }
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount) throws Exception{
        if(amount > this.balance){
            String message = "You can withdraw upto: " + this.balance;
            throw new Exception(message);
        }
        this.balance -= amount;
        return this.balance;
    }
}
