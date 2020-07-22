package com.example.functions;

public class Series {

    public static void nSum(int n) {
        if (n <= 0) {
            System.out.println("Enter number larger than 0");
        } else {
            int number = 0;
            for (int i = 0; i <= n; i++) {
                System.out.println(i + number);
                number += i;
            }
        }
    }

    public static void factorial(int n) {
        if (n <= 0) {
            System.out.println("Enter number larger than 0");
        } else {
            int number = 1;
            for (int i = 0; i <= n; i++) {
                System.out.println(number = number * i);
                if (number == 0) {
                    number++;
                }
            }
        }
    }

    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Enter number larger than 0");
        } else {
            int n1 = 0;
            int n2 = 1;

            for (int i = 0; i <= n; i++) {
                System.out.println(n1);

                int sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
        }
    }
}

