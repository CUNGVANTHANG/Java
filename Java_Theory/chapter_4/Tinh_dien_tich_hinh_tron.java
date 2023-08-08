package chapter_4;

import java.util.Scanner;

public class Tinh_dien_tich_hinh_tron {

    // computeArea() method with double parameters: radius and pi
    // calculate the area of circle and return it
    double computeArea(double radius, double pi) {
        return radius * radius * pi;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for radius
        double radius = input.nextDouble();

        // variable to store the value of pi
        double pi = 3.14;

        Tinh_dien_tich_hinh_tron obj = new Tinh_dien_tich_hinh_tron();

        // call computeArea() with parameters: radius and pi
        double result = obj.computeArea(radius, pi);
        System.out.println(result);

        input.close();
    }
}
