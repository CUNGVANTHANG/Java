package chapter_1;

import java.util.Scanner;

public class Lay_nhieu_gia_tri_dau_vao {
    
    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // get integer input
        int intInput = input.nextInt();

        // get double input
        double doubleInput = input.nextDouble();

        // print input values
        System.out.println(intInput);
        System.out.println(doubleInput);

        // close the Scanner object
        input.close();
    }
}
