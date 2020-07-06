package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get 5 numbers from user
        int[] intArray = getNumbers(5);
        //Sort user numbers in decreasing order and print them
        printArray(sortIntegers(intArray));
    }

    //Get numbers from user
    public static int[] getNumbers(int number) {
        int[] userIntValues = new int[number];

        System.out.println("Enter " + number + " integer values:\r");
        for (int i = 0; i < userIntValues.length; i++) {
            userIntValues[i] = scanner.nextInt();
        }

        return userIntValues;
    }

    //Print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    //Sort array
    public static int[] sortIntegers(int[] array) {
        /* int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        } */
        int[] sortedArray = Arrays.copyOf(array, array.length); //Does same as above
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
