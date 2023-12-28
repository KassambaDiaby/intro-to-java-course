package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    // Additonal private field specific to this class
    private double overdraftLimit;

    // my constructor that initialises superclass first
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // a getter to return the current overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // a setter, sets the overdraft limit
    public void setOverdraftLimit(double newOverdraftLimit) {
        overdraftLimit = newOverdraftLimit;
    }

    // overwritting the withdraw implementation from the super class, if amount
    // withdrawing > overdraft limit, you cant withdraw if not run withdraw method
    // as normal from superclass
    @Override
    public double withdraw(double amount) {
        if (amount > overdraftLimit) {
            System.out.println("you've exceeded overdraft limit");
        } else {
            super.withdraw(amount);
        }
        return amount;

    }
}