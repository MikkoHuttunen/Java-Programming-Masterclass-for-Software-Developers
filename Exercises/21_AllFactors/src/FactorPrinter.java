public class FactorPrinter {

    public static void printFactors(int number) {

        //Validation
        if (number < 1) {
            System.out.println("Invalid value");
        }

        for (int i = 1; i<= number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            }
        }
    }
}
