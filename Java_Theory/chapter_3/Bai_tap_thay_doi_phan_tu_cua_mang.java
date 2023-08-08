package chapter_3;

import java.util.Scanner;

public class Bai_tap_thay_doi_phan_tu_cua_mang {
    public static void main(String[] args) {
        
        // create integer array
        int[] primeNumber = {2, 3, 5, 7};
        
        // get integer input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // assign number to the fourth element of primeNumber
        primeNumber[3] = number;

        // print array elements
        for (int i = 0; i < primeNumber.length; i++) {
            System.out.println(primeNumber[i]);
        }

        input.close();
    }
}
