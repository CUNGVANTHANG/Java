package Recursive;

import java.util.Scanner;

public class tinh_giai_thua {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.err.println(factorial(n));

        input.close();
    }
}