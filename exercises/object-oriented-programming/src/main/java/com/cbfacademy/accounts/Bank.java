package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    // creating a list to store instances of the account class
    List<Account> accountlist = new ArrayList<>();

    // method to add an account to the bank list, you pass in different account
    // number and balance to the add account method each time to account for
    // different account numbers ect
    public void addAccount(int accountNumber, double balance) {
        // Creating a new instance of the Account class with provided account number
        // and balance
        Account newAccount = new Account(accountNumber, balance);
        addAccount(newAccount);

    }

    // opening a new account irrespective of savings or current , given a generic
    // account type
    private void addAccount(Account newAccount) {
        accountlist.add(newAccount);
    }

    // method to open a new savings account and adding it to the list of accounts
    public void openSavingsAccount(int accountNumber, double balance, int interestRate) {
        SavingsAccount newSavingsAccount = new SavingsAccount(accountNumber, balance, interestRate);
        accountlist.add(newSavingsAccount);
    }

    // method to open a new current account and adding it to the list of accounts
    public void openCurrentAccount(int accountNumber, double balance, int overdraftLimit) {
        CurrentAccount newCurrentAccount = new CurrentAccount(accountNumber, balance, overdraftLimit);
        accountlist.add(newCurrentAccount);
    }

    // method to get a list of account numbers held by the bank
    // a method called getAccount number that retruns a list of integers
    public List<Integer> getAccountNumbers() {
        // a new empty array list called accountnumbers
        List<Integer> accountNumbers = new ArrayList<>();

        // for each account in the account list
        for (Account account : accountlist) {
            // I want you to get the accountnumber of every account one at a time or call
            // the getaccount number method on each account,then add the result to my
            // account number arrays list.

            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    // method to get an account given an account number
    // call account number method, passing in an account number
    public Account getAccount(int accountNumber) {
        // for each account in the list, if the account number is equal to account
        // number passed in, then return the matching account
        for (Account account : accountlist) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        // Return null if no account with the specified account number is found
        return null;
    }

    // method to close an account given an account number, takes in account number
    // as a parameter, we are just removing that account that matches, we're
    // removing from the list
    public boolean closeAccount(int accountNumber) {
        for (Account account : accountlist) {
            if (account.getAccountNumber() == accountNumber) {
                // if its a mathch, I want you to remove the account from the listand print this
                // out
                accountlist.remove(account);
                System.out.println("Account with account number " + accountNumber + " closed successfully.");
                return true; // Account closed successfully
            }
        }
        // Account with the specified account number not found
        System.out.println("Account with account number " + accountNumber + " not found.");
        return false; // Account not found

    }
}
