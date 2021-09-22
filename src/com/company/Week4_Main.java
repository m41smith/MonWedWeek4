package com.company;

public class Week4_Main {

    public static void main(String[] args) {
        var myAccount = new Week4_BankAccount();
        myAccount.deposit(1000);
        myAccount.addInterest();
        var didSucceed = myAccount.withdraw(2000);
        if (didSucceed)
            System.out.println("successfully Made withdrawal");
        else
            System.out.println("Could not withdraw, current balance is "+ myAccount.checkBalance());
    }
}
