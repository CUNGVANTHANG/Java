package chapter_2;

import java.util.Scanner;

public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {

        // get input value for year
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // check if year is divisible by 400
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        }
        // check if the year is divisible by 4 and doesn't end with 00
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        }
        // otherwise print Not a Leap Year
        else {
            System.out.println("Not a Leap Year");
        }
        
        input.close();
    }
}
