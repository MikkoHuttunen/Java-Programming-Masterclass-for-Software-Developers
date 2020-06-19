public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        //Validation
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i=1; i<number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            return true;
        }

        return false;
    }
}
