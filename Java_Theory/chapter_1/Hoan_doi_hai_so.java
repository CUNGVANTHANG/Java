package chapter_1;

import java.util.Scanner;

public class Hoan_doi_hai_so {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for x and y
        int x = input.nextInt();
        int y = input.nextInt();

        // temporary variable
        int temp;

        // swap two values using temp
        temp = x;
        x = y;
        y = temp;

        // print values after swapping
        System.out.println(x + "\n" + y);

        input.close();
    }
}
