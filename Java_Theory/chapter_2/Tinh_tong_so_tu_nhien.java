package chapter_2;

import java.util.Scanner;

public class Tinh_tong_so_tu_nhien {
    public static void main(String[] args) {

        // get input value for n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // variable to store the value of sum
        int sum = 0;

        // loop runs from 1 to n
        for (int i = 1; i <= n; ++i) {
            // add i to sum
            sum = sum + i;
        }

        // print the value of sum
        System.out.println(sum);

        input.close();
    }

}
