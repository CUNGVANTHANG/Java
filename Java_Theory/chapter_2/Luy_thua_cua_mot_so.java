package chapter_2;

import java.util.Scanner;

public class Luy_thua_cua_mot_so {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for number and power
        int number = input.nextInt();
        int power = input.nextInt();
        
        // variable to store the power of number
        int result = 1;

        // run a loop from 1 to power
        for (int i = 1; i <= power; i++) {
            // inside the loop multiply number with result
            result = result*number;
        } 

        // print the result
        System.out.println(result);

        input.close();
    }
}
