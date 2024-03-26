package uet_oasis.week6.da_hinh_2;

import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point() {
        pointX = 0;
        pointY = 0;
    }

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Khoang cach.
     * 
     * @param newPoint new Point.
     * @return return.
     */
    public double distance(Point newPoint) {
        if (newPoint != null) {
            return Math.sqrt(Math.pow(newPoint.getPointX() - this.pointX, 2)
                    + Math.pow(newPoint.getPointY() - this.pointY, 2));
        } else {
            return Math.sqrt(Math.pow(this.pointX, 2) + Math.pow(this.pointY, 2));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point another = (Point) o;
            return (Math.abs(this.pointX - another.getPointX()) <= 0.001)
                    && (Math.abs(this.pointY - another.getPointY()) <= 0.001);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getPointX(), this.getPointY());
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", this.pointX, this.pointY);
    }
}
