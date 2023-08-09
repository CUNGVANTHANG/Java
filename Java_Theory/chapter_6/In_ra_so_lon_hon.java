package chapter_6;

import java.util.Scanner;

class In_ra_so_lon_hon {
    public static void main(String[] args) {
        
        // get input value
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        
        // compare number1 with number2
        // if both numbers are equal, mark number1 as larger
        int larger = number1 > number2 ? number1 : number2;
        System.out.println(larger);

        input.close();
    }
}