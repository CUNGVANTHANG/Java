package chapter_3;

import java.util.Scanner;

public class Luyen_tap_tim_phan_tu_nho_nhat_cua_mang {
    public static void main(String[] args) {

        // create an array
        int[] numbers = new int[5];

        // get input values for numbers
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
          numbers[i] = input.nextInt();
        }
        
        // create a variable smallest and assign the first element of numbers to it
        int smallest = numbers[0];

        // run a for loop from i = 1 to i < numbers.length
        for (int i = 1; i < numbers.length; i++) {

            // check if array element is smaller than smallest
            // if true, assign the element to smallest
            if (numbers[i] < smallest) {
              smallest = numbers[i];
            }
        }

        // print smallest
        System.out.println(smallest);

        input.close();
    }
}
