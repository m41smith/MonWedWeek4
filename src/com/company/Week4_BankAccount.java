package com.company;

public class Week4_BankAccount {
    private double balance;
    private float interestRate;
    private int accountID;
    private static int nextID = 1000;

    public Week4_BankAccount(){
        interestRate = 0.02f;
        accountID = nextID;
        nextID++;
    }

    public Week4_BankAccount(double initialBalance, float initialRate){
        balance = initialBalance;
        interestRate = initialRate;
        accountID = nextID;
        nextID += 1;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public boolean withdraw(double amount){
        if(balance < amount)
            return false;
        balance -= amount;
        return true;
    }
    public double checkBalance(){
        return balance;
    }
    public double addInterest(){
        var interest = balance *  interestRate;
        balance += interest;
        return balance;
    }
    public void printBalance(){
        System.out.println(balance);
    }
    public int getAccountID(){
        return accountID;
    }

}
