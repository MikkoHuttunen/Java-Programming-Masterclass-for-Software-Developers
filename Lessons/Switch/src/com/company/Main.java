package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 3;

        //Basic if-else statements
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        //If-else statement done with switches
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break; //Break out from switch statement
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case4: case5: //Multiple statements with switches
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                //No break statement so code will continue running to the next statement
            default: //Else statement if nothing above meets the conditions default will be executed
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
        //After break code resumes here

        //Challenge

        char character = 'D';

        //Switch statement that checks a char value of variable character
        switch (character) {
            case 'A':
                System.out.println("Character was A");
                break;
            case 'B':
                System.out.println("Character was B");
                break;
            case 'C':
                System.out.println("Character was C");
                break;
            case 'D':
                System.out.println("Character was D");
                break;
            case 'E':
                System.out.println("Character was E");
                break;
            default:
                System.out.println("Character was not A, B, C, D or E");
                break;
        }

        String month = "January";

        //Switch statement with String variable
        //Is case-sensitive so .toLowerCase() -function is used to prevent spelling errors
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        //Print out the day of the week corresponding to the given number between 1-7
        printDayOfTheWeek(5);
        printDayOfTheWeek(-1);
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
