package chapter_1;

import java.util.Scanner;

public class Tinh_the_tich_khoi_lap_phuong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take integer input for the length
        int length = input.nextInt();

        // compute the volume and print it
        int volume = length * length * length;
        System.out.println(volume);

        input.close();
    }
}
