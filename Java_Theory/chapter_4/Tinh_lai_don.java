package chapter_4;

import java.util.Scanner;

public class Tinh_lai_don {
    // simpleInterest() method with double parameters: principal, time, rate
    // calculate the simple interest and return it
    double simpleInterest(double principal, double time, double rate) {
      return (principal * time * rate) / 100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for principal, time, and rate
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();

        Tinh_lai_don obj = new Tinh_lai_don();

        // call simpleInterest() with arguments principal, time, and rate
        double result = obj.simpleInterest(principal, time, rate);

        // print the returned value
        System.out.println(result);
        
        input.close();
    }

}
