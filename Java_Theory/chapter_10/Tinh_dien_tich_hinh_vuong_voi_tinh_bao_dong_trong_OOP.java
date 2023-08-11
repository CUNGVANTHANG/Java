package chapter_10;

import java.util.Scanner;

class Square {

    // create a private field
    private int length;

    // setter method
    public void setLength(int length) {

        // condition to check if length is greater than 0
        // if true, assign value of length to the private field length using this
        // otherwise, print Length of a square cannot be less than 0.
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length of a square cannot be less than 0.");
        }
    }

    // create method to calculate area and print it
    void calculateArea() {
        System.out.println(length * length);
    }
}

class Tinh_dien_tich_hinh_vuong_voi_tinh_bao_dong_trong_OOP {
    public static void main(String[] args) {

        // get input value for length
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        // create an object of Square
        Square obj = new Square();

        // call the setter method with the length argument
        obj.setLength(length);

        // call the calculateArea() method
        obj.calculateArea();

        input.close();
    }
}
