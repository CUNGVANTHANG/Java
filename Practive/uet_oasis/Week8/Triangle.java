public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * contructor 1.
     * 
     */
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    /**
     * contructor 2.
     * 
     * @param p1 p1.
     * @param p2 p2.
     * @param p3 p3.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if (p1 == null || p2 == null || p3 == null
                || p1.equals(p2) || p1.equals(p3) || p2.equals(p3)
                || (p1.getPointX() - p2.getPointX())
                        / (p1.getPointY() - p2.getPointY()) == (p2.getPointX() - p3.getPointX())
                                / (p2.getPointY() - p3.getPointY())) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * getArea().
     * 
     * @return area.
     */
    public double getArea() {
        double a = this.getP1().distance(this.getP2());
        double b = this.getP2().distance(this.getP3());
        double c = this.getP1().distance(this.getP3());
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * getPerimeter().
     * 
     * @return perimeter.
     */
    public double getPerimeter() {
        double a = this.getP1().distance(this.getP2());
        double b = this.getP2().distance(this.getP3());
        double c = this.getP1().distance(this.getP3());
        return a + b + c;
    }

    /**
     * getInfo().
     * 
     * @return info string.
     */
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", this.getP1().getPointX())
                + "," + String.format("%.2f", this.getP1().getPointY())
                + ")"
                + ",(" + String.format("%.2f", this.getP2().getPointX())
                + "," + String.format("%.2f", this.getP2().getPointY())
                + ")"
                + ",(" + String.format("%.2f", this.getP3().getPointX())
                + "," + String.format("%.2f", this.getP3().getPointY())
                + ")]";
    }

}
