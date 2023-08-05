package chapter_1;

import java.util.Scanner;

public class Tinh_lai_don {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for principal, time, rate
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();

        // compute simple interest
        double simpleInterest = (principal * time * rate) / 100;

        // compute final amount
        double finalAmount = principal + simpleInterest;

        // print simple interest and final amount in separate lines
        System.out.println(simpleInterest + "\n" + finalAmount);
        
        input.close();
    }
}
