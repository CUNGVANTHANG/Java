package chapter_8;

import java.util.Scanner;

class Coordinate {

    // fields to store coordinates
    int x;
    int y;

    // constructor to initialize value of x and y
    // Hint: use this keyword
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Main class
class Main {

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values fo 4 coordinates
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        // create an object of Coordinate with arguments x1 and y1
        Coordinate c1 = new Coordinate(x1, y1);

        // create another object of Coordinate with arguments x2 and y2
        Coordinate c2 = new Coordinate(x2, y2);

        // subtract x coordinates of c1 and c2
        int xDiff = c1.x - c2.x;

        // subtract y coordinate of c1 and c2
        int yDiff = c1.y - c2.y;

        // print the result
        System.out.println(xDiff);
        System.out.println(yDiff);

        input.close();
    }
}
