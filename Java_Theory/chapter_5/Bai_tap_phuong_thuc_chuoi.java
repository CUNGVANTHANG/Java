package chapter_5;

import java.util.Scanner;

public class Bai_tap_phuong_thuc_chuoi {
    public static void main(String[] args) {
        
        // get string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        
        // get length of both strings
        int firstLength = first.length();
        int secondLength = second.length();
        
        // compare the length of strings
        if (firstLength < secondLength) {
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }
        
        input.close();
    }
}
