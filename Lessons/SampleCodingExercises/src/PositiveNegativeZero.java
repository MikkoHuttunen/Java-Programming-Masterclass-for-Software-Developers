public class PositiveNegativeZero {

    //Sample project to exercise using IDE to test exercise code from Udemy

    //main method must be added when testing exercise in IntelliJ
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}
