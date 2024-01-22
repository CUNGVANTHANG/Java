package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class phan_tu_cuc_tri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 1; i < n - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                System.err.print(i + " ");
            }
        }

        input.close();
    }
}
