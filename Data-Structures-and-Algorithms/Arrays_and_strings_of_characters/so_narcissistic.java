package Arrays_and_strings_of_characters;

import java.util.Scanner;

public class so_narcissistic {
    static int numberOfDigits(int number) {
        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    static int pow(int number, int n) {
        int res = 1;

        if (n == 0) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            res = res * number;
        }

        return res;

    }

    static int narcissistic(int number) {
        int check = 0;

        int numbers = number;

        while (numbers > 0) {
            check = check + pow(numbers % 10, numberOfDigits(number));
            numbers /= 10;
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (narcissistic(array[i]) == array[i]) {
                System.err.print(array[i] + " ");
                flag = false;
            }
        }

        if (flag) {
            System.err.println("NO");
        }

        input.close();
    }
}
