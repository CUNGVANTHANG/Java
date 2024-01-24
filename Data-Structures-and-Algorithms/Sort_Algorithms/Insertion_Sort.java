package Sort_Algorithms;

import java.util.Scanner;

public class Insertion_Sort {
    static void insertion_Sort(int n, int array[]) {
        for (int i = 0; i < array.length; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        insertion_Sort(n, array);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        input.close();
    }
}
