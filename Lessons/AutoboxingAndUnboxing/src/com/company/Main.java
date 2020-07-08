package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Mikko");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //Deprecated way of defining Integer and Double object
        Integer integer = new Integer(54);
        Double doubleValue = new Double((12.25));

        //Current way of defining Integer and Double object
        Integer integer2 = 54; //Integer.valueOf(54)
        Double doubleValue2 = 12.25;

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        //Autoboxing converts primitive type to Integer(object)
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        //Unboxing converts Integer(object) back to primitive type
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        System.out.println("********************");

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        //Autoboxing
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
