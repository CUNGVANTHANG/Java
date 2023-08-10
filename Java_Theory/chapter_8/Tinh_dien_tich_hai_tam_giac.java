package chapter_8;

class Triangle {

    // integer fields
    int base;
    int height;

    // constructor of the class
    // initialize the value of base and height
    Triangle(int b, int h) {
        this.base = b;
        this.height = h;
    }

    // method to compute the area of triangle
    void calculateArea() {
        int area = (base * height) / 2;
        System.out.println(area);
    }
}

class Main {
    public static void main(String[] args) {

        // create the first object t1 of Triangle with parameter 5 and 14
        Triangle t1 = new Triangle(5, 14);

        // call calculateArea() using the first object
        t1.calculateArea();

        // create the second object t2 of Triangle with arguments 12 and 32
        Triangle t2 = new Triangle(12, 32);

        // call calculateArea() using the second object
        t2.calculateArea();
    }
}
