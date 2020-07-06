package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue; //Assign the value of another int variable

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        //anotherIntValue is now different even though it's assigned to be the same as myIntValue
        System.out.println("myIntValue after change = " + myIntValue);
        System.out.println("anotherIntValue after change = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //Assign the value of another array

        //toString() converts array values to string
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        //Changing one of the reference arrays pointing the same address updates each of them
        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        //Even after modifying array in another method it updates all of the references
        System.out.println("myIntArray after modifyArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray after modifyArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2; //Parameter adds 3. reference to the same array
        //De-referencing an array. It now points to a new array
        array = new int[] {1, 2, 3, 4, 5};
    }
}
