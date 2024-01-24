package Sort_Algorithms;

import java.util.Scanner;

public class Bubble_Sort_Optimal {
    static void bubble_Sort_Optimal(int n, int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int swapped = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    swapped = 1;
                }
            }
            if (swapped == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        bubble_Sort_Optimal(n, array);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        input.close();
    }
}
