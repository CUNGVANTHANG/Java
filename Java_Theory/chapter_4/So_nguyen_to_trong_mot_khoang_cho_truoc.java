package chapter_4;

import java.util.Scanner;

public class So_nguyen_to_trong_mot_khoang_cho_truoc {

    boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for two intervals
        int x = input.nextInt();
        int y = input.nextInt();

        So_nguyen_to_trong_mot_khoang_cho_truoc obj = new So_nguyen_to_trong_mot_khoang_cho_truoc();

        // run a loop to access each value in interval x and y
        for (int i = x; i <= y; ++i) {

            // call checkPrime for every value between x and y
            boolean result = obj.checkPrime(i);

            // if returned value is true, print the number
            if (result) {
                System.out.println(i);
            }
        }

        input.close();
    }

}
