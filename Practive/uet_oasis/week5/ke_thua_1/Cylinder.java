package uet_oasis.week5.ke_thua_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    @Override
    public double getArea() {
        return 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + "],height=" + height;
    }
}
