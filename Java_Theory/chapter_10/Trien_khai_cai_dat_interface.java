package chapter_10;

import java.util.Scanner;

// create an interface named Polygon with a method calculateArea()
interface Polygon {
    abstract public void calculateArea();
}

// implement the Square class from Polygon
class Square implements Polygon {
    int length;

    // constructor to initialize length
    Square(int length) {
        this.length = length;
    }

    // implement the method of the interface
    // compute the area of square and print it
    public void calculateArea() {
        System.out.println(length * length);
    }
}

class Main {
    public static void main(String[] args) {

        // get input value for the length
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        // create an object of Square with argument, length
        Square s1 = new Square(length);

        // call the calculateArea() method using the object
        s1.calculateArea();

        input.close();
    }
}
