package chapter_1;

import java.util.Scanner;

public class Doi_don_vi_pound_sang_kilogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // get input value for pound
        double pound = input.nextDouble();

        // convert pound to kg and print value in kg
        double kg = pound * 0.453592;
        System.out.println(kg);

        input.close();
    }
}
