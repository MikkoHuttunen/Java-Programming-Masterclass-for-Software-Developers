package com.company;

public class Main {

    public static void main(String[] args) {

        //Initializing a new object and calling it's constructor
        BankAccount bobsAccount = new BankAccount("Bob Brown", "(087) 123-4567", "bob@myemail.com", "12345", 0.00);
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdraw((100.0));
        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        System.out.println("********************");

        BankAccount bethsAccount = new BankAccount();
        System.out.println(bethsAccount.getName());
        System.out.println(bethsAccount.getPhoneNumber());
        System.out.println(bethsAccount.getEmail());
        System.out.println(bethsAccount.getAccountNumber());
        System.out.println(bethsAccount.getBalance());

        System.out.println("********************");

        //Challenge

        /*Create a new class VipCustomer with 3 fields name, email address and credit limit.
        Create 3 constructors and getters for the fields.*/

        VipCustomer vipBob = new VipCustomer("Bob Brown", "bob@myemail.com", 99999.0);
        System.out.println(vipBob.getName());
        System.out.println(vipBob.getEmail());
        System.out.println(vipBob.getCreditLimit());

        VipCustomer vipBeth = new VipCustomer("Beth Blue", "beth@myemail.com");
        System.out.println(vipBeth.getName());
        System.out.println(vipBeth.getEmail());
        System.out.println(vipBeth.getCreditLimit());

        VipCustomer vipBarry = new VipCustomer();
        System.out.println(vipBarry.getName());
        System.out.println(vipBarry.getEmail());
        System.out.println(vipBarry.getCreditLimit());
    }
}
