package chapter_5;

import java.util.Scanner;

public class Ghep_hai_chuoi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for text1 and text2
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        
        // join two strings with a space in between
        // hint: join the first string with " " (empty string)
        // join the new string with the second string
        String joinedString = text1 + " " + text2;
        
        System.out.println(joinedString);

        input.close();
    }
}
