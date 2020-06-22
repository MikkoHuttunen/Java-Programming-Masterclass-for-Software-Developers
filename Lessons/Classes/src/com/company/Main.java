package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car(); //Initialized new object name porsche from class Car
        Car holden = new Car();
        porsche.setModel("Carrera"); //Set the porche's model
        System.out.println("Model is " + porsche.getModel()); //Get the porsche's model

        //Challenge

        /*Create a new class for bank account with fields for customer name, phone number, email,
        account number and balance. Create getters and setters for each field and two additional
        methods for deposit and withdrawing funds.*/

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setName("Bob Brown");
        bobsAccount.setPhoneNumber("(087) 123-4567");
        bobsAccount.setEmail("bob@myemail.com");
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(0.00);

        bobsAccount.withdraw((100.0));

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);
    }
}
