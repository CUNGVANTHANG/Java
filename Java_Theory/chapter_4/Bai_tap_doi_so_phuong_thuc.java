package chapter_4;

import java.util.Scanner;

public class Bai_tap_doi_so_phuong_thuc {
    // method that adds two double number
    void addNumbers(double n1, double n2) {
        // add two numbers and print the result
        double result = n1 + n2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        
        // take input value
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        
        // creating object of Main class
        Bai_tap_doi_so_phuong_thuc obj = new Bai_tap_doi_so_phuong_thuc();
    
        // call the method with arguments number1 and number2
        obj.addNumbers(number1, number2);

        input.close();
    }
}
