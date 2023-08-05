package chapter_2;

import java.util.Scanner;

public class Bai_tap_vong_lap_for_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int n = input.nextInt();
     
            // check if n is in between 1 and 100
            // if not, break the loop
            if (n <= 0 || n > 100) {
              break;
            }

            // print the value of n
            System.out.println(n);
    }
        input.close();
  }
}
