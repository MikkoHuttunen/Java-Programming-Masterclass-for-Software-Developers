public class Main {

    public static void main(String[] args) {

        //Returns true or false if the given number is a "perfect number"
        //Perfect number is a positive integer which is equal to the sum of its proper positive divisors
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));
    }
}
