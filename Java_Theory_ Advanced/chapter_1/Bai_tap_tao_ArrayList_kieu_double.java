package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_tap_tao_ArrayList_kieu_double {
    public static void main(String[] args) {

        // create Double ArrayList
        ArrayList<Double> numbers = new ArrayList<>();
        // take input from the user
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();

        // add elements to numbers
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);

        // iterate through numbers
        for (int i = 0; i <= 3; ++i) {

            // print element using get()
            System.out.println(numbers.get(i));

        }
        
        input.close();
    }
}
