package com.company;

import java.io.File;

public class BankAccount implements Logger{
    private double balance;
    private float interestRate;
    private int accountID;
    private static int nextID = 1000;

    public BankAccount(){
        interestRate = 0.02f;
        accountID = nextID;
        nextID++;
    }
    public BankAccount(double initialBalance, float initialRate){
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

    @Override
    public void writeLogging(String toLog) {
        File logFile = new File(Logger.DEFAULT_FILE_NAME);
        if (logFile.canWrite())
            System.out.println("If we had try/catch and error we would write to file");
    }

}
