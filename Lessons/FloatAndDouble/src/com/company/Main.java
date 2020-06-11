package com.company;

public class Main {

    public static void main(String[] args) {

        //Float

        //Get the minimum and maximum value of data type float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        //Double

        //Get the minimum and maximum value of data type double
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        //You can separate numerical data types by adding letter to the end of the value
        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Dividing is much more precise when using float and double values because they can handle decimals
        int myDividedIntValue = 5 / 3;
        float myDividedFloatValue = 5f / 3f;
        //Double is more precise than float because it can handle larger numbers
        //Double is used more often because it is faster than float on modern computers
        double myDividedDoubleValue = 5d / 3d;

        System.out.println("MyDividedIntValue = " + myDividedIntValue);
        System.out.println("MyDividedFloatValue = " + myDividedFloatValue);
        System.out.println("MyDividedDoubleValue = " + myDividedDoubleValue);

        //Different kind of decimal value expressions
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println("pi = " + pi);
        System.out.println("anotherNumber = " + anotherNumber);

        //Challenge 1
        //Cast decimal value as float

        //Java assumes decimals to be double if no letter is added to the end so casting the value as float will correct that
        float floatValue = (float) 5.25;

        //Challenge 2
        //Convert pounds to kilograms using right data types

        double pounds = 5;
        double poundsToKilograms = 0.45359237 * pounds;

        System.out.println(pounds + " pounds is " + poundsToKilograms + " kilograms");
    }
}
