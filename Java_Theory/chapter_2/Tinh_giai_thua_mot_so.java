package chapter_2;

import java.util.Scanner;

public class Tinh_giai_thua_mot_so {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number
        int number = input.nextInt();

        int factorial = 1;

        // run a for loop from i = 1 to i <= number
        // inside the loop multiply factorial with i
        int i = 1;
        while(i <= number) {
          factorial = factorial * i;
          i++;
        }

        // print factorial
        System.out.println(factorial);
        
        input.close();
    }
}
