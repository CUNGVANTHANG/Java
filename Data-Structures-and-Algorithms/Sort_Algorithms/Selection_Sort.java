package Sort_Algorithms;

import java.util.Scanner;

public class Selection_Sort {
    static void selection_Sort(int n, int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            // Tim kiem phan tu nho nhat trong mang chua sap xep
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min_idx] > array[j]) {
                    min_idx = j;
                }
            }

            // Doi cho phan tu nho nhat voi phan tu dau tien chua sap xep
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        selection_Sort(n, array);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        input.close();
    }
}
