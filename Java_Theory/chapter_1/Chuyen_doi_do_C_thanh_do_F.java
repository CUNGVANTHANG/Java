package chapter_1;

import java.util.Scanner;

public class Chuyen_doi_do_C_thanh_do_F {
    
    public static void main(String[] args) {

        // create object class of Scanner class 
        Scanner input = new Scanner(System.in);

        // take temperature in degree celsius from the user
        double celsius = input.nextDouble();
 
        // convert degree to fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;
 
        // print degree in fahrenheit
        System.out.println(fahrenheit);
        input.close();

    }
}
