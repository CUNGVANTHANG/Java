package chapter_5;

import java.util.Scanner;

class Bai_tap_truy_cap_ky_tu {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get String input
        String text = input.nextLine();
        
        // find the last character of the string
        // Hint: The last character of the string is at position length - 1
        char last = text.charAt(text.length() - 1);
        System.out.println(last);

        input.close();
    }
}