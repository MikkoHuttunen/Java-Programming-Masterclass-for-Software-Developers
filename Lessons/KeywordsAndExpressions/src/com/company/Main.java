package com.company;

public class Main {

    public static void main(String[] args) {

        //Data type double is a keyword and kilometres including everything after that are expressions except the semicolon
        double kilometres = (100 * 1.609344); //a Mile is equal to 1.609344 kilometres
        int highScore = 50;

        //If is a keyword and highScore == 50 is expression
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        //Expression challenge

        //In the following code below, write down what parts of the code are expressions.

        //score = 100 is expression
        int score = 100;
        //score > 99 is expression
        if (score > 99) {
            //"You got the high score!" is expression
            System.out.println("You got the high score!");
            //score = 0 is expression
            score = 0;
        }
    }
}
