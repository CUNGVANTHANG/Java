package chapter_2;

import java.util.Scanner;

public class Cac_goc_trong_cua_tam_giac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get 3 input values for angles
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // find the sum of all angles
        int sum = x + y + z;

        // check if sum is equal to 180 and print either true or false
        if (sum == 180) {
          System.out.println("true");
        }
        else System.out.println("false");
        
        input.close();
    }
}
