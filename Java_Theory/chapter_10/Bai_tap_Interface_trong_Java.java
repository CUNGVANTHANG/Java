package chapter_10;

import java.util.Scanner;

interface Polygon {
    // abstract method
    abstract public void getArea(double base, double height);
}

// implement Polygon
class Triangle implements Polygon {
    
    // provide implementation for getArea
    // compute area using the formula on description and print it
    public void getArea(double base, double height) {
      System.out.println(base * height * 0.5);
    }
}

class Bai_tap_Interface_trong_Java {
    public static void main(String[] args) {
        
        // object of Triangle class
        Triangle obj = new Triangle();
        
        // take input value for base and height
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        
        // find the area of triangle
        obj.getArea(base, height);
        input.close();
    }
}

