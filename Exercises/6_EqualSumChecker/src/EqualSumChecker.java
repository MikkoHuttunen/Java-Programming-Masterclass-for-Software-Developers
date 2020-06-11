public class EqualSumChecker {

    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue) {

        if (firstValue + secondValue == thirdValue) {
            return true;
        }

        return false;
    }
}
