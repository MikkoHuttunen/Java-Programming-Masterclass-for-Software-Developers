public class IntEqualityPrinter {

    public static void printEqual(int firstValue, int secondValue, int thirdValue) {

        //Checks if parameters are equal or not
        if (firstValue < 0 || secondValue < 0 || thirdValue < 0) {
            System.out.println("Invalid value");
        } else if (firstValue == secondValue && secondValue == thirdValue) {
            System.out.println("All numbers are equal");
        } else if (firstValue != secondValue && firstValue != thirdValue && secondValue != thirdValue) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
