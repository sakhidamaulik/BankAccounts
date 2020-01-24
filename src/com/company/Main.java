package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Welcome to MAU Private Bank");

        System.out.println("Please Enter 1 for CurrentAccount\n" +
                           "Please Enter 2 for SavingAccount\n" +
                           "Please Enter 3 for Premium Saving Account\n");
        int accountType = scan.nextInt();

        System.out.println("Please enter initial deposit amount: ");
        double initialAmount = scan.nextDouble();
        Account account;
        double amount = 0;
        try {
            if(accountType == 1){
                account = new CurrentAccount(initialAmount);
                account.printBalance();
                System.out.println("Enter new deposit amount: ");
                amount = scan.nextDouble();
                account.deposit(amount);
                account.printBalance();
                System.out.println("Enter new withdraw amount: ");
                amount = scan.nextDouble();
                account.withdraw(amount);
                account.printBalance();
            }

            if(accountType == 2){
                account = new SavingAccount(initialAmount);
                account.printBalance();
                System.out.println("Enter new deposit amount: ");
                amount = scan.nextDouble();
                account.deposit(amount);
                account.printBalance();
                System.out.println("Enter new withdraw amount: ");
                amount = scan.nextDouble();
                account.withdraw(amount);
                account.printBalance();
            }

            if(accountType == 3){
                account = new PremiumSavingAccount(initialAmount);
                account.printBalance();
                System.out.println("Enter new deposit amount: ");
                amount = scan.nextDouble();
                account.deposit(amount);
                account.printBalance();
                System.out.println("Enter new withdraw amount: ");
                amount = scan.nextDouble();
                account.withdraw(amount);
                account.printBalance();
            }


        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
