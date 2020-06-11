package com.company;

public class Main {

    public static void main(String[] args) {

        //Integer

        int myValue = 10000;
        //Get min and max values of integer
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        //Underscores to make the number look more clear
        int myMaxIntTest = 2_147_483_647;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //Java overflow by adding 1 to the max value
        System.out.println("Busted MAX value = " + (myMaxIntValue +1));
        //Java underflow by subtracting 1 from the min value
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        //Byte

        //Get min and max values of byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //Short

        //Get min and max values of short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //Long

        //Java considers value as integer unless you add L at the end of long
        long myLongValue = 100L;
        //Get min and max values of long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long bigLongLiteralValue = 2_147_483_647_234L;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println(bigLongLiteralValue);

        //Arithmetic and Casting

        //Java defaults number values as integer
        int myTotal = (myMinIntValue / 2);
        //Cast integer as byte
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        //Cast integer as short
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
