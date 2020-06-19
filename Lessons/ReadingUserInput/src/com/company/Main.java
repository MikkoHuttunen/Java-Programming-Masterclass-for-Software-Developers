package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner object named scanner that reads user inputs

        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); //Store user input in the variable name

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt(); //Checks if the next input is int

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); //Convert user input to int
            scanner.nextLine(); //After you read a number there must be a scanner.nextLine();
            int age = 2020 - yearOfBirth;

            //Validation for year of birth
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        //Reading user input challenge

        int number = 1;
        int sum = 0;

        while (number <= 10) {
            System.out.println("Enter number #" + number);
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int userNumber = scanner.nextInt();
                if (userNumber >= 0) {
                    sum += userNumber;
                    number++;
                } else {
                    System.out.println("Number can't be negative");
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); //Handle end of line (enter key)
        }

        System.out.println("The sum of your given numbers is " + sum);

        //Minimum and maximum challenge

        int minNumber = 0;
        int maxNumber = 0;

        //Infinite loop so break statement is needed
        while(true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int userNumber = scanner.nextInt();
                if (userNumber >= 0) {
                    //First input will assign both values
                    if (minNumber == 0 && maxNumber == 0) {
                        minNumber = userNumber;
                        maxNumber = userNumber;
                    }

                    if (userNumber < minNumber) {
                        minNumber = userNumber;
                    }

                    if (userNumber > maxNumber) {
                        maxNumber = userNumber;
                    }
                } else {
                    System.out.println("Number can't be negative");
                }
            } else {
                break;
            }

            scanner.nextLine(); //Handle input
        }

        System.out.println("Minimum number is " + minNumber);
        System.out.println("Maximum number is " + maxNumber);
        scanner.close(); //Close scanner after it is no longer needed
    }
}
