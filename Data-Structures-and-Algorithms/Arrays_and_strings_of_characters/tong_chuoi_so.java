package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class tong_chuoi_so {

    public static void main(String[] args) {
        int n;
        int a[] = new int[100];

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); // Nhập số lượng phần tử n của dãy

        int res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt(); // Nhập các phần tử trong dãy.

            res = res + a[i];
        }

        System.out.println(res);

        scanner.close();
    }
}
