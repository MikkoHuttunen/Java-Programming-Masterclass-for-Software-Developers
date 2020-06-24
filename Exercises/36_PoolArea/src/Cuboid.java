public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height) {
        super (width, length);
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
