package com.company;

public class Main {

    public static void main(String[] args) {

        //Main difference between while and for loop is that you need to increment variable manually inside while loop
        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("********************");

        count = 1;

        while (true) {
            //Break out of the while loop when count reaches 6
            if (count == 6) {
                break;
            }

            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("********************");

        count = 1;

        //do-while loops execute at least once
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println("********************");

        //Challenge 1

        int number = 4;
        int endNumber = 20;

        while (number <= endNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //If not even number jump back to the start of the loop
            }

            System.out.println("Even number " + number); //If it was even number print it out
        }

        System.out.println("********************");

        //Challenge 2
        //Modify while loop above to print out total number of even values
        //Break out after 5 are found

        number = 4;
        endNumber = 20;
        int sum = 0;
        int totalNumbers = 0;

        while (number <= endNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //If not even number jump back to the start of the loop
            }

            System.out.println("Even number " + number); //If it was even number print it out
            sum += number;
            totalNumbers++;
            if (totalNumbers >= 5) {
                break; //Break out of the loop after 5 even numbers found
            }
        }

        System.out.println("Total number of even numbers is " + sum);

        System.out.println("********************");

        //Digit Sum challenge

        //Prints out the sum of the given numbers digits
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));

    }

    public static boolean isEvenNumber(int number) {

        //Validation and checking if parameter is not an even number
        if (number <= 0 || number % 2 != 0) {
            return false;
        }

        return true;
    }

    public static int sumDigits(int number) {

        //Validation
        if (number < 0 || number < 10) {
            return -1;
        }

        int sum = 0;

        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 -120 = 5
        while (number > 0) {
            //Extract the least-significant digit
            int digit = number % 10;
            sum += digit;
            //Drop the least-significant digit
            number /= 10; //Same as number = number / 10;
        }

        return sum;
    }
}
