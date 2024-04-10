public class Point {
    private double pointX;
    private double pointY;

    public Point() {
        this.pointX = 0;
        this.pointY = 0;
    }

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public Point(Point point) {
        this.pointX = point.getPointX();
        this.pointY = point.getPointY();
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
     * distance.
     * 
     * @param other other.
     * @return return.
     */
    public double distance(Point other) {
        try {
            return Math.sqrt(Math.pow(this.getPointX() - other.getPointX(), 2)
                    + Math.pow(this.getPointY() - other.getPointY(), 2));
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        try {
            if (o instanceof Point) {
                Point another = (Point) o;
                return Math.abs(this.pointX - another.getPointX()) <= 0.001
                        && Math.abs(this.pointY - another.getPointY()) <= 0.001;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
