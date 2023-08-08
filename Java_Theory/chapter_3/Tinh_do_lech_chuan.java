package chapter_3;

import java.util.Scanner;

public class Tinh_do_lech_chuan {
    public static void main(String[] args) {

        // array to store numbers
        double[] numbers = new double[5];

        // get input for numbers
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextDouble();
        }
        
        double sum = 0.0;

        // find the sum of all the array elements
        for (int i = 0; i < numbers.length; ++i) {
            sum = sum + numbers[i];
        }

        // compute the mean
        double mean = sum / numbers.length;
        
        double result = 0.0;
        for (int i = 0; i < numbers.length; ++i) {

            // find the difference of each array value and mean
            double difference = numbers[i] - mean;

            // compute the square of each difference
            double squaredDifference = Math.pow(difference, 2);

            // add all the square difference 
            result += squaredDifference;
        }

        // compute the variance by dividing the above result by numbers.length
        double variance = result / numbers.length;

        // compute the standard deviation by computing the square root of variance
        double sd = Math.sqrt(variance);
        
        System.out.println(sd);

        input.close();
    }
}
