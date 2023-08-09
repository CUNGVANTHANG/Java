package chapter_5;

import java.util.Scanner;

public class Dem_so_ky_tu_nguyen_am_trong_chuoi {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // convert the string input to lowercase for simplicity
        // hint: use toLowerCase() method
        text = text.toLowerCase();

        // variable to count the number of vowels
        int vowels = 0;

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; i < text.length(); ++i) {

            // access each character using charAt()
            boolean x = text.charAt(i) == 'a' ||
                     text.charAt(i) == 'e' ||
                     text.charAt(i) == 'i' ||
                     text.charAt(i) == 'o' ||
                     text.charAt(i) == 'u';

            // check if each character is vowel of not
            // hint: compare x with all vowel characters using ||
            if (x) {
                // increase the value of vowels by 1
                vowels++;
            }
        }

        System.out.println(vowels);
        input.close();
    }
}
