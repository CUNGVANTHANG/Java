package chapter_4;

import java.util.Scanner;

public class Vi_du_kiem_tra_so_chan_le {

    // method to check even or odd
    // if the number is even, true is returned.
    // if the number is odd, false is returned.

    boolean checkOddEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        // create object of Scanner class
        Scanner input = new Scanner(System.in);

        // create object of main class
        Vi_du_kiem_tra_so_chan_le obj = new Vi_du_kiem_tra_so_chan_le();

        int n = input.nextInt();

        // result will contain either true or false
        boolean result = obj.checkOddEven(n);

        // executes if result is true
        if (result) {
            System.out.println(n + " is even");
        }

        // executes if result is false
        else {
            System.out.println(n + " is odd");
        }

        input.close();
    }
}
