package uet_oasis.week6.da_hinh_2;

import java.util.Objects;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + this.topLeft.toString() + ",side=" + this.getSide()
                + ",color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square another = (Square) o;
            return this.topLeft.equals(another.getTopLeft())
                    && Math.abs(this.getSide() - another.getSide()) <= 0.001;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width);
    }
}
