public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private double radius;
    private Point center;

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    /**
     * contructor circle.
     * 
     * @param center center.
     * @param radius radius.
     */
    public Circle(Point center, double radius) {
        if (center != null) {
            this.center = center;
        } else {
            this.center = new Point();
        }

        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }

    public Point getCenter() {
        return center;
    }

    /**
     * set center.
     * 
     * @param center center.
     */
    public void setCenter(Point center) {
        if (center != null) {
            this.center = center;
        }
    }

    public double getRadius() {
        return radius;
    }

    /**
     * set radius.
     * 
     * @param radius radius.
     */
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getArea() {
        return this.getRadius() * this.getRadius() * PI;
    }

    public double getPerimeter() {
        return this.getRadius() * 2 * PI;
    }

    /**
     * getInfo().
     * 
     * @return info string.
     */
    public String getInfo() {
        return "Circle[(" + String.format("%.2f", this.getCenter().getPointX())
                + "," + String.format("%.2f", this.getCenter().getPointY())
                + "),r=" + String.format("%.2f", this.getRadius())
                + "]";
    }
}
