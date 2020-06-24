public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);

        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    //Getters
    public double getHeight() {
        return height;
    }

    //Calculate volume
    public double getVolume() {
        return super.getArea() * getHeight();
    }
}
