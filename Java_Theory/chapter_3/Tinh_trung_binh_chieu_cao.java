package chapter_3;

import java.util.Scanner;

public class Tinh_trung_binh_chieu_cao {
    public static void main(String[] args) {

        // array to store height
        double[] heights = new double[11];

        // get input for heights
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        double sum = 0.0;

        // find the sum of all the heights
        for (double height : heights) {
          sum = sum + height;
        }

        // find the mean height and print it
        double mean = sum / heights.length;
        System.out.println(mean);

        input.close();
    }
}
