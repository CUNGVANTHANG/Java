package chapter_8;

import java.util.Scanner;

class Triangle {
    // create two fields
    int base;
    int height;
    
    // initialize value of base and height
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    
    // compute the area of the right-angled triangle
    double computeArea() {
        double area = (double) 1 / 2 * (this.base * this.height);
        return area;
    }
}

class Main {
    public static void main(String[] args) {
        
        // get input values for base and height
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();
        
        // object of Triangle
        Triangle obj = new Triangle(base, height);
        
        // call the method to compute area
        double area = obj.computeArea();
        System.out.println(area);

        input.close();
    }
}
