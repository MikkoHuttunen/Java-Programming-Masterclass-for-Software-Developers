public class AreaCalculator {

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }

        //Calculates the area of a circle
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return -1.0;
        }

        //Calculates the area of a rectangle
        return x * y;
    }
}
