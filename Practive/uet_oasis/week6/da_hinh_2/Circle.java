package uet_oasis.week6.da_hinh_2;

import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Contructor 4.
     * 
     * @param center center.
     * @param radius radius.
     * @param color  color.
     * @param filled filled.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[center=" + this.center.toString() + ",radius=" + this.radius
                + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle another = (Circle) o;
            return this.center.equals(another.getCenter())
                    && Math.abs(this.radius - another.getRadius()) <= 0.001;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}