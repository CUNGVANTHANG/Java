package Recursive;

import java.util.Scanner;

public class chuoi_fibonacci_khong_de_quy {
    public static Scanner scanner = new Scanner(System.in);

    static int fibo(int n) {
        int fn = 1;
        int f0 = 0;
        int f1 = 1;
        // 1 1 2 3 5 8 13 21
        for (int i = 1; i < n; i++) {
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;
        }

        return fn;
    }

    public static void main(String[] args) {
        int n;
        n = scanner.nextInt();
        System.out.println(fibo(n));
    }
}
