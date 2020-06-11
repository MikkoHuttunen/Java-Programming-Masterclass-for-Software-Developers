public class Main {

    public static void main(String[] args) {

        //Assigning value of a method from the SpeedConverter.java
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
