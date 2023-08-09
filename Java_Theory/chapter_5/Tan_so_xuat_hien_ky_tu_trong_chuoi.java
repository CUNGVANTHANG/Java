package chapter_5;

import java.util.Scanner;

public class Tan_so_xuat_hien_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get input value for string
        String text = input.nextLine();

        // variable to store the occurrence of 'a'
        int count = 0;

        // run a for loop to access each character of a string
        for (int i = 0; i < text.length(); ++i) {
            
            // compare each string character with the specified character
            // use the charAt() method to access the character from string
            // if match found, increase the value of count by 1
            boolean result = text.charAt(i) == 'a';
            if (result) {
              count++;
            }
        }

        System.out.println(count);

        input.close();
    }

}
