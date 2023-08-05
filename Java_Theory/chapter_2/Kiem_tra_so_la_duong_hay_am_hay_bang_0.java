package chapter_2;

import java.util.Scanner;

public class Kiem_tra_so_la_duong_hay_am_hay_bang_0 {
    public static void main(String[] args) {
     
        // get integer input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     
        // check if number is positive
        if (number == 0) {
            System.out.println("zero");
        }
        // check if number is negative
        else if (number < 0) {
            System.out.println("negative");
        }
        // otherwise print zero
        else {
            System.out.println("positive");
        }
     
        input.close();
     
    }
}
