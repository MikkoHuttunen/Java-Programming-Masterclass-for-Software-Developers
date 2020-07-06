package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many numbers you want to input:");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Minimum value of the given numbers = " + findMin(readIntegers(count)));
    }

    //Read user numbers and return an array
    public static int[] readIntegers(int count) {
        int[] userInputs = new int[count];

        System.out.println("Enter " + count + " integer numbers\r");
        for (int i = 0; i < count; i++) {
            userInputs[i] = scanner.nextInt();
        }

        return userInputs;
    }

    //Find minimum value of an array
    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
