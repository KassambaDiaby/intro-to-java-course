package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;// a private access modifier so you need a getter to access the field
    private double balance;
    double amount;
    double requested;

    // constructor that takes in the new account number and starting balance
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    };

    // a getter method that returns the current account balance
    public double getBalance() {
        return balance;
    }

    // a getter method , returns account number
    public int getAccountNumber() {
        return accountNumber;
    };

    // a deposit fund method to deposit money into account and return the new
    // balance
    public double deposit(double amount) {
        // balance += amount
        double newBalance = balance + amount;
        return newBalance;
    };

    // a withdraw method that withdraws funds from the account and returns the
    // requested amount or 0 if the account has an insufficient balance
    public double withdraw(double requested) {

        // if this is true than i have enough money to even withdraw from
        if (requested <= balance) {

            // read from left to right, takeaway requested amount from balance and then set
            // result to balance , so this is the updated amount after you withdraw
            balance -= requested;

            // return the fund's I'm requesting aka give me the money
            return requested;
        } else {// oyherwise i dont have enbough money and dont give me anything
            System.out.println("not enough funds");
        }
        return 0;
    }
}
