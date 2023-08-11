package chapter_10;

class Area {

    // calculate area of Rectangle
    void computeArea(double length, double breadth) {
        System.out.println(length * breadth);
    }

    // compute area of Square
    void computeArea(double length) {
        System.out.println(length * length);
    }
}

class Bai_tap_nap_chong_phuong_thuc {

    public static void main(String[] args) {

        // create object of Area class
        Area a1 = new Area();

        // call method to calculate area of rectangle
        a1.computeArea(2, 2);

        // call method to calculate area of square
        a1.computeArea(3);
    }
}
