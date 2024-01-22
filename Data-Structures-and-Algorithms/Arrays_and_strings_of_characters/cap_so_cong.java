package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class cap_so_cong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int congSai = array[1] - array[0];
        boolean check = true;

        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] - array[i] != congSai) {
                check = false;
                System.err.println("NO");
                break;
            }
        }

        if (check) {
            System.err.println("YES");
        }

        input.close();
    }
}
