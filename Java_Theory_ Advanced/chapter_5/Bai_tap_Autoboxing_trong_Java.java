package chapter_5;

import java.util.Scanner;

public class Bai_tap_Autoboxing_trong_Java {
    public static void main(String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        // convert number to Double
        Double xObj = number;

        // print xObj
        System.out.println(xObj);

        input.close();
    }
}
