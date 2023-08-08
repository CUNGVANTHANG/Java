package chapter_2;

import java.util.Scanner;

public class Tim_boi_lon_nhat_cua_mot_so {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        // run a for loop from i = 100 to 1
        for (int i = 100; i > 0; i--) {

            // check if i is divisible by number
            // if true, print i and exit the loop
            if (i % number == 0 || number % i == 0) {
              System.out.println(i);
              break;
            }
        }

        input.close();
    }
}
