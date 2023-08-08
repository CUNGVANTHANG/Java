package chapter_4;

import java.util.Scanner;

public class Tim_can_bac_ba_cua_mot_so {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // get number input
        int number = input.nextInt();
        
        // use the cbrt() method to find the cube root
        double cubeRoot = Math.cbrt(number);
        System.out.println(cubeRoot);
        
        input.close();
    }
}
