package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //Method calls can be assigned as variable values
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        //Method call with variables as parameters
        calculateScore(gameOver, score, levelCompleted, bonus);
        //Method call with values as parameters
        calculateScore(true,10000,8, 200);

        //Challenge

        //Create a method called displayHighScorePosition
        //It should have players name as a parameter, and a 2nd parameter as a position in the high score table
        //You should display the players name along with a message like "managed to get into position" and the
        //position they got and further message "on the high score table".
        //Create 2nd method called calculateHighScorePosition
        //It should be sent one argument only, the player score
        //It should return an int
        //The return data should be
        //1 if the score is >= 1000
        //2 if the score is >= 500
        //3 if the score is >= 100 and < 500
        //4 in all other cases
        //Call both methods and display the results of the following
        //a Score of 1500, 900, 400 and 50

        //Method calls with a string value and a method call as a parameters
        displayHighScorePosition("Adam", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(900));
        displayHighScorePosition("Carl", calculateHighScorePosition(400));
        displayHighScorePosition("David", calculateHighScorePosition(50));
    }

    //New method to calculate score that takes 4 variables as parameters from the main method where it is called
    //Method returns int value so it is specified as int not void
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        //Method must return a value so return value -1 if above statement is not true
        } else {
            return -1;
        }
    }

    //Void method because no need to return data
    public static void displayHighScorePosition(String playerName, int placement) {
        System.out.println("Congratulations " + playerName + "! You placed in " + placement + " on the high score table");
    }

    //Returns int value so int method instead of void
    public static int calculateHighScorePosition(int playerScore) {
        int position = 4; //Assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

        //Another way of doing the same thing
        /*if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;*/
    }
}
