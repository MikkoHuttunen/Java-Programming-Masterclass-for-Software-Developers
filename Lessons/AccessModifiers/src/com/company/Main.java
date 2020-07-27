package com.company;

public class Main {

    public static void main(String[] args) {
	    Account mikkosAccount = new Account("Mikko");
        mikkosAccount.deposit(1000);
        mikkosAccount.withdraw(500);
        mikkosAccount.withdraw(-200);
        mikkosAccount.deposit(-20);
        mikkosAccount.calculateBalance();
        //mikkosAccount.balance = 5000;

        System.out.println("Balance on account is " + mikkosAccount.getBalance());
        //mikkosAccount.transactions.add(4500);
        mikkosAccount.calculateBalance();
    }
}
