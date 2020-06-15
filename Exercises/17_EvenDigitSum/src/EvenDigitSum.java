public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10; //Get the last digit

            //Check if even number and add it to the sum
            if (digit % 2 == 0) {
                sum += digit;
            }

            number /= 10; //Drop the least-significant digit
        }

        return sum;
    }
}
