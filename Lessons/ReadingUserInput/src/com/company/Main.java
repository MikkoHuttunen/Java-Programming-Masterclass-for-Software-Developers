package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner object named scanner that reads user inputs

        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); //Store user input in the variable name

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt(); //Convert user input to int
        scanner.nextLine(); //After you read a number there must be a scanner.nextLine();
        int age = 2020 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close(); //Close scanner after it is no longer needed
    }
}
