public class SumOddRange {

    public static boolean isOdd(int number) {

        //Validation
        if (number < 0 || number % 2 == 0) {
            return false;
        }

        return true;
    }

    public static int sumOdd(int start, int end) {

        //Validation
        if (start < 0 || end < 0 || start > end) {
            return -1;
        }

        int sum = 0;

        //Loop through the range of numbers and add odd numbers to the variable sum
        for (int i=start; i<=end; i++) {
            if (SumOddRange.isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}

