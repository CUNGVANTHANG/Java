package chapter_1;

import java.util.Scanner;

public class Lay_dau_vao_so_thuc {
    
    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // get salary input
        double salary = input.nextDouble();

        // get bonus input
        double bonus = input.nextDouble();

        // find total income
        double income = salary + bonus;

        System.out.println(income);

        // close the Scanner object
        input.close();
    }

}
