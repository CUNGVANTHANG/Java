package chapter_5;

import java.util.Scanner;

public class Bai_tap_so_sanh_chuoi {
    public static void main(String[] args) {
        
        // take two string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        
        // compare two strings
        boolean result = first.equals(second);
        
        // print the result
        System.out.println(result);
    
        input.close();
    }

}
