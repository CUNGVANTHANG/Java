package chapter_5;

import java.util.Scanner;

public class Bai_tap_noi_chuoi {

    public static void main(String[] args) {

        // take two string inputs
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();

        // join strings using concat
        // add a space between two strings
        // Hint: Join first string with a space " " and
        // join the resulting string with second string
        String joinedString = firstName.concat(" ").concat(lastName);

        System.out.println(joinedString);

        input.close();
    }

}
