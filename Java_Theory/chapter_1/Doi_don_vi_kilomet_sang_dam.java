package chapter_1;

import java.util.Scanner;

public class Doi_don_vi_kilomet_sang_dam {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take input for km
        double km = input.nextDouble();
        
        // convert km to miles
        double miles = km / 1.6;

        // display value in miles
        System.out.println(miles);

        input.close();
    }
}
