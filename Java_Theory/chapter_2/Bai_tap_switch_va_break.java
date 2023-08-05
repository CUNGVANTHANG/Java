package chapter_2;

import java.util.Scanner;

public class Bai_tap_switch_va_break {
    public static void main(String[] args) {

        // take number input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // corresponding case is executed depending on the value of number
        switch (number) {
            
            // cases to find odd number
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Odd Number");
                break;
                
            // cases to find even numbers
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Even Number");
                break;
                
            default:
                System.out.println("Invalid Number");
        }
        input.close();
    }
}
