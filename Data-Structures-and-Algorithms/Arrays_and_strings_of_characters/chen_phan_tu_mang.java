package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class chen_phan_tu_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int array[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int k = input.nextInt();
        int element = input.nextInt();

        for (int i = n; i >= k; i--) {
            array[i] = array[i - 1];
            if (i == k) {
                array[i] = element;
            }
        }

        for (int i = 0; i < n + 1; i++) {
            System.err.print(array[i] + " ");
        }

        input.close();
    }
}
