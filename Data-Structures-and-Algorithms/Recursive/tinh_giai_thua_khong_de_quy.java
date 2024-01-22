package Recursive;

import java.util.Scanner;

public class tinh_giai_thua_khong_de_quy {
    public static Scanner scanner = new Scanner(System.in);

    static long factorial(int n) {
        long res = 1;

        for (int i = 0; i < n; i++) {
            res = res * (i + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.err.println(factorial(n));
    }
}
