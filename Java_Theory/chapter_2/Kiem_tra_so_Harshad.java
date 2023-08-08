package chapter_2;

import java.util.Scanner;

public class Kiem_tra_so_Harshad {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // variable to store the num of digits
        int sum = 0;

        // assign number to num variable
        int num = number;

        // use loop to access each digit and find sum of digits
        while (num != 0) {

            // access each digit using num % 10
            int digit = num % 10;
            
            // add each digit to sum
            sum = sum + digit;

            // remove last digit of num
            num = num / 10;
        }

        // check if number is perfectly divided by sum
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        }
        else {
            System.out.println("Not a Harshad Number");
        }
        
        input.close();
    }
}
