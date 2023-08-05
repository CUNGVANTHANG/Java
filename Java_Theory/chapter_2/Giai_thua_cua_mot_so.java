package chapter_2;

import java.util.Scanner;

public class Giai_thua_cua_mot_so {
    public static void main(String[] args) {

        // take integer input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int total = 1;

        // run for loop from i = 1 to i = n
        for (int i = 0; i < n; i++) {
        // multiply value of i to total and assign to total
        total = total * (i + 1);
        }

        System.out.println(total);
        input.close();
    }
}
