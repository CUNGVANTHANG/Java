package chapter_5;

import java.util.Scanner;

public class In_ky_tu_khong_phai_chu_cai {
    public static void main(String[] args) {

        // get input value for string
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // run a for loop to access each character of a string
        // hint: run loop from 0 to string.length() - 1
        for (int i = 0; i < text.length(); i++) {

            // access each character using charAt()
            char x = text.charAt(i);

            // check if the string falls in the range from 'a' to 'z' or 'A' to 'Z'
            // hint: use >= 'a' and <= 'z' for both cases
            if (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z') {

                // if true, skip the current iteration of loop
                continue;
            }

            // print x if it doesn't fall in the range
            System.out.println(x);
        }

        input.close();
    }
}
