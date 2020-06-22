public class Wall {

    private double width;
    private double height;

    public Wall(double width, double height) {
        if (width < 0) {
            width = 0;
        }

        if (height < 0) {
            height = 0;
        }

        this.width = width;
        this.height = height;
    }

    //Default constructor
    public Wall() {
        this(0.0,0.0);
    }

    //Getter
    public double getWidth() {
        return width;
    }

    //Getter
    public double getHeight() {
        return height;
    }

    //Setter
    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    //Setter
    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        return (this.width * this.height);
    }
}
