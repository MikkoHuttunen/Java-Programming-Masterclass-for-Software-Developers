package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2020";
        System.out.println("numberAsString = " + numberAsString);

        int intNumber = Integer.parseInt(numberAsString); //Converts string to integer
        double doubleNumber = Double.parseDouble(numberAsString); //Converts string to double
        System.out.println("intNumber = " + intNumber);
        System.out.println("doubleNumber = " + doubleNumber);

        numberAsString += 1;
        intNumber += 1;

        System.out.println("numberAsString = " + numberAsString); //String value concatenates
        System.out.println("intNumber = " + intNumber); //Int value adds 1
    }
}
