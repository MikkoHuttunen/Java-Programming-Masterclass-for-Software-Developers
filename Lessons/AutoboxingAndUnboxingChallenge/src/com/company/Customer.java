package com.company;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions; //ArrayList for the transaction amounts

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>(); //Initialize new ArrayList of doubles
        addTransaction(initialAmount);
    }

    //Add transaction to the array list
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    //Getters
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
