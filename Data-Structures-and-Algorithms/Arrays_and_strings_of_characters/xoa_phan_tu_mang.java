package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class xoa_phan_tu_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int deleteLocation = input.nextInt();

        for (int i = deleteLocation; i < n - 1; i++) {
            array[i] = array[i + 1];
        }

        for (int i = 0; i < n - 1; i++) {
            System.err.print(array[i] + " ");
        }

        input.close();
    }
}
