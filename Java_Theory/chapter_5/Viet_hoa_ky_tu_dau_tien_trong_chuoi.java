package chapter_5;

import java.util.Scanner;

public class Viet_hoa_ky_tu_dau_tien_trong_chuoi {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // use substring() to split the input string to two strings
        // first substring contains the first letter
        // hint: to access first letter, use indexes 0 and 1
        String firstLetter = text.substring(0, 1);

        // second substring contains the remaining letters
        // hint: to use remaining letters, use indexes 1 and string.length()
        String remainingLetters = text.substring(1);

        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();

        // join the two substrings
        text = firstLetter + remainingLetters;
        System.out.println(text);

        input.close();
    }
}
