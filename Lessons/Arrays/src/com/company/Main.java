package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Standard array initialization in Java
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Assign 6. value of array to number 50
        myIntArray[5] = 50;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[9]);

        //Assign array with 11 double values
        double[] myDoubleArray = new double[10];

        printArray(myIntArray);

        //Get 5 numbers from user inputs and assign them to array
        int[] userIntArray = getIntegers(5);
        for (int i = 0; i < userIntArray.length; i++) {
            System.out.println("Element " + i + ", typed value was " + userIntArray[i]);
        }
        //Calculate average number from the user inputs
        System.out.println("Average is " + getAverage(userIntArray));
    }

    public static void printArray(int[] array) {
        //For loop to assign values of to array
        for (int i = 0; i < array.length; i++) {
            array[i] = (i * 10);
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
