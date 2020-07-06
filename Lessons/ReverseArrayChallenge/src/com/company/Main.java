package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 5;
        int[] integers = new int[count];

        System.out.println("Enter "  + count + " integer numbers:\r");
        for (int i = 0; i < count; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("integers = " + Arrays.toString(integers));
        reverse(integers);
        System.out.println("integers reversed = " + Arrays.toString(integers));
    }

    //Reverse the values in array
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
