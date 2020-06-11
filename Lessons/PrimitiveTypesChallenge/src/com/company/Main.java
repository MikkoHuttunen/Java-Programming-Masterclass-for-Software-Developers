package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 64;
        short myShortValue = 16384;
        int myIntValue = 1073741824;
        //Forcing long datatype by adding L at the end of the values
        long longTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println(longTotal);

        //Need to cast short because the value is too large
        short shortTotal = (short) (1000 + 10L * (myByteValue + myShortValue + myIntValue));
    }
}
