package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        //else if statement executes if the main if statement returns as false
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        //else statement executes if non of the above if or else if statements return as true
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            //Variable created inside code block can't be accessed outside of it
            //Code block can still access variables outside of it
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Challenge

        //Print out a second score on the screen with the following
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //But make sure the first printout above still displays as well

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
