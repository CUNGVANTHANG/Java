package chapter_2;

import java.util.Scanner;

public class Du_tuoi_bau_cu_1 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
     
        // check if age is greater than or equal to 18
        if (age > 18) {
            // print The person can vote if true
            System.out.println("The person can vote.");
        } 
        input.close();
    }
}
