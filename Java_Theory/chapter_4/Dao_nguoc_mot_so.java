package chapter_4;

import java.util.Scanner;

public class Dao_nguoc_mot_so {

    // method to reverse a number
    int findReverse(int number) {
        int reversed = 0;
        int remainder;

        // run a while loop until number is equal to 0
        // inside the loop, find the reverse of number
        // hint: use logic number % 10 to find the last digit
        // add last digit to reversed using logic: reversed * 10 + last digit
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Dao_nguoc_mot_so obj = new Dao_nguoc_mot_so();

        // call findReverse() with argument, number
        int result = obj.findReverse(number);
        System.out.println(result);

        input.close();
    }

}
