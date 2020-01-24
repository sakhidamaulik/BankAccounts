package com.company;

public class CurrentAccount extends  Account {
    public CurrentAccount(double balance){
        this.balance = balance;
    }

    @Override
    public double deposit(double amount) throws Exception {
        if(amount > 100000){
            throw new Exception("If your amount is greater than 1 lac needs approval from bank manager");
        }
        this.balance += amount;
        return this.balance;
    }

    @Override
    public double withdraw(double amount) throws Exception{
        double maxWithdrawLimit = this.balance - 500;
        if(amount > maxWithdrawLimit){
            String message = "You can withdraw upto " + maxWithdrawLimit;
            throw new Exception(message);
        }
        this.balance -= amount;
        return this.balance;
    }
}
