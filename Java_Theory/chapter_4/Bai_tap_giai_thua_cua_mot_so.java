package chapter_4;

import java.util.Scanner;

public class Bai_tap_giai_thua_cua_mot_so {
     
    // create the computeFactorial() method with a parameter
    int computeFactorial(int n) {

        int factorial = 1;

        // run a for loop from 1 to the method parameter
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        // return factorial
        return factorial;
    }

    public static void main(String[] args) {
        Bai_tap_giai_thua_cua_mot_so obj = new Bai_tap_giai_thua_cua_mot_so();

        // get user input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // call the method with input value as parameter
        int total = obj.computeFactorial(n);
        System.out.println(total);

        input.close();
    }

}
