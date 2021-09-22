package com.company;

public class Week4_Main {

    public static void main(String[] args) {
        var myAccount = new Week4_BankAccount();
        var yourAccount = new Week4_BankAccount(2000,0.05f);
        myAccount.deposit(1000);
        myAccount.addInterest();
        yourAccount.addInterest();
        System.out.println("Your account with ID: " +yourAccount.getAccountID() +
                " Currently has a balance of "+yourAccount.checkBalance());
        var didSucceed = myAccount.withdraw(2000);
        if (didSucceed)
            System.out.println("successfully Made withdrawal");
        else
            System.out.println("Could not withdraw,from account number" + myAccount.getAccountID() +
                    " current balance is "+ myAccount.checkBalance());
    }
}
