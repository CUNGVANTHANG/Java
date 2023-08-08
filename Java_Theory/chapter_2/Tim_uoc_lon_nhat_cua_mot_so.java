package chapter_2;

import java.util.Scanner;

public class Tim_uoc_lon_nhat_cua_mot_so {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // run the loop from i = number - 1 to 1
        for (int i = number - 1; i > 0; i--) {

            // check if number is divisible by i
            // if true, print the value of i and break the loop
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }

        input.close();
    }
}
