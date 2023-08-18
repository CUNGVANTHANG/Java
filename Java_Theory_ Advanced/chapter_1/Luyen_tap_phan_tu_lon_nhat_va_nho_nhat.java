package chapter_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Luyen_tap_phan_tu_lon_nhat_va_nho_nhat {
    public static void main(String[] args) {

        // create an ArrayList of Integers
        ArrayList<Integer> numberList = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // add elements to numberList
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);

        // find minimum element in numberList
        int minimum = Collections.min(numberList);
        System.out.println(minimum);

        // find maximum element in numberList
        int maximum = Collections.max(numberList);
        System.out.println(maximum);

        input.close();
    }
}
