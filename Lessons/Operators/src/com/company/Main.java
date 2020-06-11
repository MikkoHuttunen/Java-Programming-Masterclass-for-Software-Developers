package com.company;

public class Main {

    public static void main(String[] args) {

        //Operators are the symbols between values that performs specific operations i.e. = and + operator below
        //Operands are the objects that are manipulated by an operator i.e. 1 and 2 below
        //Expressions are formed by combining variables, literals, method return values and operators

        //Plus operator
        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        //Minus operator
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
        //Multiplying operator
        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        //Dividing operator
        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        //Modulus/remainder operator
        result = result % 3; //The remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //Abbreviating operators

        //result = result + 1;
        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        //result = result - 1;
        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);
        //result = result + 2;
        result += 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        //result = result * 10;
        result *= 10; //3 * 10 = 30
        System.out.println("3 * 10 = " + result);
        //result = result / 3;
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = " + result);
        //result = result - 2;
        result -= 2; //10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        //If-then statement

        //= operator is used for assigning value to operand
        //== operator is used for comparing the values of operands
        boolean isAlien = false;
        //If statement without a code block will affect only the next line of code
        if (isAlien == true)
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens"); //Will not be affected by the if statement

        //If statement with a code block
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens"); //Will be affected by the if statement
        }

        int topScore = 80;
        //!= not equal -operator
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }

        //> greater than -operator
        if (topScore > 100) {
            System.out.println("You got the high score!");
        }

        //>= greater or equal than -operator
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        //< less than -operator
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        //<= less or equal than -operator
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        //Logical AND -operator

        int secondTopScore = 60;
        //&& and -operator checks if both statements returns as true
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        //Logical OR -operator

        //|| or -operator checks if either or both statements returns as true
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        //Assignment -operator VS equals to -operator

        /* Programming mistake examples:
        int newValue = 50;

        //Mistyped data type. Trying to assign numerical value when boolean is expected. Will show as an error.
        if (newValue = 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;

        //Will not show as an error because even though using assigning operator, boolean data type is provided.
        if (isCar = true) {
            System.out.println("This is not supposed to be happen");
        }
        */

        boolean isCar = true;

        //Shorter way to check if statement is true
        if (isCar) {
            System.out.println("This is a car");
        }

        //Shorter way to check if statement is not true
        if (!isCar) {
            System.out.println("This is a car");
        }

        //Ternary operator

        //Ternary operator can be used as shortcut for if-then-else statement

        //Check statement and assign true or false to the boolean variable
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;

        if (isEighteenOrOver) {
            System.out.println("Client is over 18 years old");
        }

        //Operator challenge

        //This challenge demonstrates Java operator precedences

        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        //Calculations inside parenthesis will be executed first
        double myTotal = (myDouble + mySecondDouble) * 100.00d;
        System.out.println("myTotal = " + myTotal);
        double totalRemainder = myTotal % 40.00d;
        System.out.println("totalRemainder = " + totalRemainder);
        boolean remainderIsZero = (totalRemainder == 0) ? true : false;
        System.out.println("remainderIsZero = " + remainderIsZero);

        //Result will be opposite if you delete the parenthesis from line 157
        if (!remainderIsZero) {
            System.out.println("Got some remainder");
        }
    }
}
