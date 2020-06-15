public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;

        while (stored > 0) {
            //Extract the least-significant digit
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            //Drop the least-significant digit
            stored /= 10; //Same as number = number / 10;
        }

        if (number == reverse) {
            return true;
        }

        return false;
    }
}
