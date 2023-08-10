package chapter_8;

import java.util.Scanner;

class Rectangle {

    // integer fields
    int length;
    int breadth;

    // constructor of the class
    // initialize the value of length and breadth
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to compute the area of rectangle
    void calculateArea() {
        int area = length * breadth;
        System.out.println(area);
    }
}

class Main {
    public static void main(String[] args) {

        // input values for x and y
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        // create an object of Rectangle with arguments x and y
        Rectangle obj = new Rectangle(x, y);

        // call the calculateArea() method using the object
        obj.calculateArea();

        input.close();
    }
}
