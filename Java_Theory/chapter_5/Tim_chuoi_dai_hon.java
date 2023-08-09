package chapter_5;

import java.util.Scanner;

public class Tim_chuoi_dai_hon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for text1 and text2
        String text1 = input.nextLine();
        String text2 = input.nextLine();

        // get length of both strings
        int length1 = text1.length();
        int length2 = text2.length();

        // compare lengths of both strings and print the longer sting
        System.out.println(length1 > length2 ? text1 : text2);
        
        input.close();
    }
}
