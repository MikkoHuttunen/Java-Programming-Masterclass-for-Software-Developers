import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int userNumber = scanner.nextInt();
                count++;
                sum += userNumber;
            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
        scanner.close();
    }
}
