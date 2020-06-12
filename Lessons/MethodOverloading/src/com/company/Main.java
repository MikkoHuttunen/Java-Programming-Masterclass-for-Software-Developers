package com.company;

public class Main {

    //Constant variable that cannot be changed
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        //Method overloading allows to have more than one method with the same name as long as it has different parameters
        //Multiple methods of the same name with different implementations

        int newScore = calculateScore("Mikko", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        //Challenge 1 method calls
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(100);
        //Challenge 2 method calls
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    //Method with a same name called calculateScore but this one accepts only one parameter
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    //Another method called calculateScore this time without parameters
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    //Challenge 1

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        //Validation
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches value");
            return -1;
        }

        //Convert feet to centimeters
        double centimeters = (feet * 12) * 2.54;
        //Convert inches to centimeters and add them to the centimeters variable
        centimeters += inches * 2.54;
        System.out.println(feet + "ft " + inches + "in = " + centimeters + "cm");
        return centimeters;
    }

    //Method overloading with the same method name but only one parameter
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("Invalid inches value");
            return -1;
        }

        //Convert feet to inches
        double feet = (int) inches / 12;
        //Add remaining inches to separate variable
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches = " + feet + "ft and " + remainingInches + "in");
        //Call method with calculated feet and remainingInches variables
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    //Challenge 2

    public static String getDurationString(int minutes, int seconds) {

        //Validation
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            //Get error message from the constant variable assigned in line 6
            return INVALID_VALUE_MESSAGE;
        }

        //Convert minutes to hours
        int hours = minutes / 60;
        //Get remaining minutes
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";

        //Another solution that adds zero to start of duration if under 10
        /*
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
        */
    }

    //Method overloading with the same method name but only one parameter
    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        //Calculate how many minutes is in seconds parameter
        int minutesInSeconds = seconds / 60;
        //Get remaining seconds
        int remainingSeconds = seconds % 60;
        //Call method with calculated minutes and seconds as variables
        return getDurationString(minutesInSeconds, remainingSeconds);
    }
}
