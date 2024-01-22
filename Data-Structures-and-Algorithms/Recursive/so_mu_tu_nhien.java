package Recursive;

import java.util.Scanner;

public class so_mu_tu_nhien {
    public static int exponent(int n, int p) {
        if (p == 0) {
            return 1;
        } else {

            return n * exponent(n, p - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int p = input.nextInt();

        System.err.println(exponent(n, p));

        input.close();
    }
}
