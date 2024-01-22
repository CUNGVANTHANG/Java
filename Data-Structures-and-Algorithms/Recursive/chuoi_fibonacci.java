package Recursive;

import java.util.Scanner;

class chuoi_fibonacci {
    public static Scanner scanner = new Scanner(System.in);

    static int fibo(int n) {
        if (n <= 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n;
        n = scanner.nextInt();
        System.out.println(fibo(n));
    }
}
