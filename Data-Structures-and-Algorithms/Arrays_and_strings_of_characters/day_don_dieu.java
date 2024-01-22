package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class day_don_dieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        boolean check1 = true;
        boolean check2 = true;

        for (int i = 1; i < n; i++) {
            if (array[i] >= array[i - 1]) {
                check1 = false;
            }
            if (array[i] <= array[i - 1]) {
                check2 = false;
            }
        }

        if (check1 || check2) {
            System.err.println("YES");
        } else {
            System.err.println("NO");
        }

        input.close();
    }
}
