package uet_oasis.week6.da_hinh_1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }

    /**
     * Rectangle constructor 2.
     * @param width Rectangle width.
     * @param length Reactangle length.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle constructor 3.
     * @param width Rectangle width.
     * @param length Reactangle length.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }
}
