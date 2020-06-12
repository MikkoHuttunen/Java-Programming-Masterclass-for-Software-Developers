public class Main {

    public static void main(String[] args) {

        //Returns calculated area of a circle
        System.out.println(AreaCalculator.area(5.0));
        //Validation test
        System.out.println(AreaCalculator.area(-1));
        //Returns calculated area of a rectangle
        System.out.println(AreaCalculator.area(5.0, 4.0));
        //Validation test
        System.out.println(AreaCalculator.area(-1.0, 4.0));
    }

}
