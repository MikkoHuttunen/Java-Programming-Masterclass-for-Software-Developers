package com.company;

public class Main {

    public static void main(String[] args) {
        //Statement is the keyword and expression combined including the semicolon at the end
        int myVariable = 50;
        //Also statements
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        //Java can read code even if it is typed in different lines
        System.out.println("This is" +
                " another" +
                " still more.");

        //Completely valid Java statements typed in the same line
        int anotherVariable = 50;myVariable--;System.out.println("This is another one");
    }
}
