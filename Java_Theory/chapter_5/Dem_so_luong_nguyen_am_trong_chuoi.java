package chapter_5;

import java.util.Scanner;

public class Dem_so_luong_nguyen_am_trong_chuoi {
    public static void main(String[] args) {
        
        // get string input
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        
        // convert to lowercase
        text = text.toLowerCase();
        
        // variable to count vowels
        int count = 0;
        
        // run a for loop across the text string
        for (int i = 0; i < text.length(); ++i) {
            
            // check if each character is a vowel
            // Hint: Use this comparison text.charAt(i) == 'a' with each lowercase vowel characters
            // Separate each comparison with the || operator (comparison1 || comparison2 || ...)
            boolean result = text.charAt(i) == 'a' || 
                             text.charAt(i) == 'e' ||
                             text.charAt(i) == 'i' ||
                             text.charAt(i) == 'o' ||
                             text.charAt(i) == 'u';
            
            if (result) {
                
                // increase the value of count by 1.
                count++;
            }
        }
        
        System.out.println(count);

        input.close();
    }
}
