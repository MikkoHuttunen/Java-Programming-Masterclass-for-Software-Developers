package com.company;

public class Main {

    public static void main(String[] args) {
        //For loops prevent repeating code like below
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        //Simple for loop example
        for (int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        //Challenge 1

        //Call the calculateInterest method using for loop with interest rate 2-8
        for (int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("********************");

        //Challenge 2

        //Modify the for loop above to do the same thing but to start from 8% back to 2%
        for (int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        //Challenge 3

        //Use for loop to iterate through set of numbers and call isPrime method to calculate if it is prime number
        //Print out all prime numbers and exit loop after 3 prime numbers
        int count = 0;

        for (int i=1; count<3; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
                if (count >= 3) {
                    break; //Breaking out of for loop is only reasonable if the loop is very long
                }
            }
        }

        //Sum 3 and 5 challenge

        int breakOutCounter = 0;
        int sumOfNumbers = 0;

        for (int i=1; i<=1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3 and 5");
                breakOutCounter++;
                sumOfNumbers += i; //Add the value of divisible number
                if (breakOutCounter >= 5) {
                    break; //If 5 divisible numbers are found, exit the for loop
                }
            }
        }

        System.out.println("Sum of numbers is " + sumOfNumbers);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    //Method that calculates if value is prime number
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
