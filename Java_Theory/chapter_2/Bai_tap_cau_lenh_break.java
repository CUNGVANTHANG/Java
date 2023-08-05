package chapter_2;

import java.util.Scanner;

public class Bai_tap_cau_lenh_break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // the initial value of total will be 0
        int total = 0;
        int num;
        
        while (true) {
            // get an integer input
            num = input.nextInt();
            
            // check if the input is less than or equal to 0
            // break the loop if true
            // else add the value to total
            if(num <= 0) {
                
                break;
            }
            
            total = total + num;
            
        }
        
        // print the total
        System.out.println(total);
        input.close();
    }
}
