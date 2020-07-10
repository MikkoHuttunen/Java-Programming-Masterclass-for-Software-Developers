package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Nordea");

        bank.addBranch("Jyväskylä");
        bank.addCustomer("Jyväskylä", "Mikko", 100);
        bank.addCustomer("Jyväskylä","Aleksi", 80);
        bank.addCustomer("Jyväskylä", "Heidi", 150);

        bank.addCustomerTransaction("Jyväskylä", "Mikko", 20);
        bank.addCustomerTransaction("Jyväskylä", "Aleksi", 30);
        bank.addCustomerTransaction("Jyväskylä", "Heidi", 50);

        bank.addBranch("Helsinki");
        bank.addCustomer("Helsinki", "Maija", 120);
        bank.addCustomer("Helsinki", "Matti", 90);

        //Print all customers from branch Jyväskylä including transactions
        bank.listCustomers("Jyväskylä", true);
        System.out.println("********************");
        //Print all customers from branch Helsinki without transactions
        bank.listCustomers("Helsinki", false);
    }
}
