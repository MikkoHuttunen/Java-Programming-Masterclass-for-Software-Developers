package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Mikko", 100.46);
        Customer anotherCustomer;
        anotherCustomer = customer; //Points to the customer object so no new object is created
        anotherCustomer.setBalance(80.49);

        //Balance is 80.49 because anotherCustomer is pointing to the customer in memory address
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        //intList = 1, 3, 4
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        System.out.println("********************");

        //intList = 1, 2, 3, 4
        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
