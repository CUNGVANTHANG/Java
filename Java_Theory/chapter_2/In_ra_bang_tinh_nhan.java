package chapter_2;

import java.util.Scanner;

public class In_ra_bang_tinh_nhan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input value for number
        int number = input.nextInt();

        int count = 1;
        
        // use while loop to run up to count <= 10
        // inside the loop multiply number with count and print the multiplication table
        // increase count by 1 in each iteration
        while (count <= 10) {
          System.out.println(number + " * " + count + " = " + (number * count));
          count++;
        }

        input.close();
    }
}
