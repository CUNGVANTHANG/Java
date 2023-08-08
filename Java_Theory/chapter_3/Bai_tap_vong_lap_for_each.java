package chapter_3;

public class Bai_tap_vong_lap_for_each {
    public static void main(String[] args) {

        double[] numbers = { 4.2, 5.5, 2.0, 8.2, 9.6 };

        double total = 0;

        // find the sum of all elements
        for (double number : numbers) {
            total = total + number;
        }

        // find the average
        double average = total / numbers.length;

        // print the average
        System.out.println(average);
    }

}
