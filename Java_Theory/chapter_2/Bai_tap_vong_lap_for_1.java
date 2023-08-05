package chapter_2;

import java.util.Scanner;

public class Bai_tap_vong_lap_for_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // get integer input from the user
        int n = input.nextInt();

        // create multiplication table form 6 to 9
        for (int i = 6; i <= 9; i++) {
          System.out.println(n + " times " + i + " is "+ n * i);
        }
        input.close();
    }

}
