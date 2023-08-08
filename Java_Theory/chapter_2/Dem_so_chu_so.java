package chapter_2;

import java.util.Scanner;

public class Dem_so_chu_so {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count = 0;

        // loop until the number becomes 0.
        // in each iteration remove last digit of number by dividing with 10
        // increase the value of count 
        while (number != 0) {
          number = number / 10;
          count++;
        }

        // print the count outside the loop
        System.out.println(count);

        input.close();

    }
}
