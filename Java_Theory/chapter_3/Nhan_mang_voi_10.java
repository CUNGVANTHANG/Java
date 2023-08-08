package chapter_3;

import java.util.Scanner;

public class Nhan_mang_voi_10 {
    public static void main(String[] args) {

        // create an array
        int[] numbers = new int[5];

        Scanner input = new Scanner(System.in);

        // get input values for numbers using a for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // access array elements using the foreach loop
        // multiply each element by 10 and print it
        for (int number : numbers) {
            System.out.println(number * 10);
        }

        input.close();
    }

}
