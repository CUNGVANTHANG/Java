package chapter_5;

import java.util.Scanner;

public class Truy_cap_cac_ky_tu_trong_chuoi {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; i < text.length(); i++) {

            // print each character of the string
            // hint: use charAt() with index specified from the loop
            System.out.println(text.charAt(i));
        }
        
        input.close();
    }
}
