package com.cbfacademy.accounts;

//savings account inherintitng properties and behaviour of account
public class SavingsAccount extends Account {
    // additonal attribute for Savings Class
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        // 1st step is invoking constructor of the superclass,to initialize the
        // inherited properties (contrustor, method, fields) of the Account class before
        // calling constructor of
        // savings account/ derived class.
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // applies interest to the account, divide it by 100 to get it into a %
    // format.The result is stored in a variable, it represents the
    // interest amount as a percentage of the current balance.
    // call deposit method from super class but pass in the interest amount
    public void applyInterest() {
        double interestamount = getBalance() * interestRate / 100;
        deposit(interestamount);
    }

    // - returns the current interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // - sets the interest rate, takes in a parameter newinterest rate and sets it
    public void setInterestRate(double newInterestrate) {
        interestRate = newInterestrate;
    };

}
