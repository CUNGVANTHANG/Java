package uet_oasis.week6.da_hinh_2;

import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * contructor 1.
     */
    public Rectangle() {
        this.width = 0;
        this.length = 0;
        this.topLeft = new Point();
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * contructor 3.
     * 
     * @param width  width.
     * @param length length.
     * @param color  color.
     * @param filled filled.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = new Point();
        this.width = width;
        this.length = length;
    }

    /**
     * contructor 4.
     * 
     * @param topLeft topLeft.
     * @param width   width.
     * @param length  length.
     * @param color   color.
     * @param filled  filled.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        return "Rectangle[topLeft=" + this.topLeft.toString()
                + ",width=" + this.width + ",length=" + this.length
                + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle another = (Rectangle) o;
            return this.topLeft.equals(another.getTopLeft())
                    && Math.abs(this.length - another.getLength()) <= 0.001
                    && Math.abs(this.width - another.getWidth()) <= 0.001;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}
