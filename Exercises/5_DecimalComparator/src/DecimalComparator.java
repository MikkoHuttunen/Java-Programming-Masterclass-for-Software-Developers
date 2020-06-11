public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {

        //Moving the decimal place to three positions away from the current
        //Once parsed to int, the numbers after decimal are neglected
        int adjustedValue1 = (int) (firstValue * 1000);
        int adjustedValue2 = (int) (secondValue * 1000);

        if (adjustedValue1 == adjustedValue2) {
            return true;
        }

        return false;
    }
}
