package com.company;

//Imported packages
import com.example.functions.Series;

public class Main {

    public static void main(String[] args) {

        //Functions from imported class
        Series.nSum(10);
        System.out.println("********************");
        Series.factorial(10);
        System.out.println("********************");
        Series.fibonacci(10);

        Series.nSum(0);
        Series.factorial(0);
        Series.fibonacci(0);
    }
}
