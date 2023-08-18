package chapter_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tim_phan_tu_lon_nhat_va_nho_nhat {
    public static void main(String[] args) {
 
        // creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // take input from the user
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number;
        
        for (int i = 0; i < n; i++){
            number = input.nextInt();
            numbers.add(number);
        }

        // print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // find the minimum element
        System.out.println("Minimum Element: " + Collections.min(numbers));

 
        // find the maximum element
        System.out.println("Maximum Element: " + Collections.max(numbers));
        input.close();
    }
}
