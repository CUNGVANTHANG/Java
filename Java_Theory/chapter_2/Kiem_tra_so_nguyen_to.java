package chapter_2;

import java.util.Scanner;

public class Kiem_tra_so_nguyen_to {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // create a flag variable with value 0
        int flag = 0;

        // run loop from 2 to number - 1
        // check if number is divisible by number between 2 to number - 1
        for(int i = 2; i <= number - 1; i++) {
          if (number % i == 0) {
            flag = 1;
            break;
          }
        }

        // check if flag is 1 and print either Not a Prime Number or Prime Number
        if (flag == 1 || number < 2) {
          System.out.println("Not a Prime Number");
        }
        else System.out.println("Prime Number");
        
        input.close();
    }
}
