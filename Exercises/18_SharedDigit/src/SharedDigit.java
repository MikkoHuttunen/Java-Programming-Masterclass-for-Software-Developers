public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber,int secondNumber) {

        //Validation
        if (firstNumber > 99 || firstNumber < 10 || secondNumber > 99 || secondNumber < 10) {
            return false;
        }

        return (firstNumber / 10 == secondNumber / 10 || firstNumber / 10 == secondNumber % 10 ||
                secondNumber / 10 == firstNumber % 10 || firstNumber % 10 == secondNumber % 10);
    }
}
