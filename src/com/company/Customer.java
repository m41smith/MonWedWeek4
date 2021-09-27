package com.company;

import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String customerName, int taxID){
        customerID = taxID;
        name = customerName;
        accounts = new ArrayList<BankAccount>();
    }

    public boolean openAccount(double initialBalance){
        var newAccount = new BankAccount();
        newAccount.deposit(initialBalance);
        var didSucceed = accounts.add(newAccount);
    }

    public String getName(){
        return name;
    }

    public Integer getID(){
        return customerID;
    }
}