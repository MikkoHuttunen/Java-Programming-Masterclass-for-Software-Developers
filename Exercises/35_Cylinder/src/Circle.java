public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    //Getters
    public double getRadius() {
        return radius;
    }

    //Calculate area
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
