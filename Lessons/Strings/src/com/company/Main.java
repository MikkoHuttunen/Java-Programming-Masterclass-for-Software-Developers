package com.company;

public class Main {

    public static void main(String[] args) {

        //String is considered class rather than data type
        //String can handle multiple characters unlike char
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        //String can be concatenated by adding more characters to the existing string value
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        //String also accepts unicode characters
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to " + myString);
        //String can't handle mathematic operations
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);
    }
}
