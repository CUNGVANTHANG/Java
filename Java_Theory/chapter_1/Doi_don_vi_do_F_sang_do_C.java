package chapter_1;

import java.util.Scanner;

public class Doi_don_vi_do_F_sang_do_C {
    public static void main(String[] args) {

        // take fahrenheit temperature input
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();

        // convert fahrenheit temperature to celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // print temperature in celsius
        System.out.println(celsius);

        input.close();        
    }
}
