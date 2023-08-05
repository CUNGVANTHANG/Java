package chapter_1;
//import the Scanner class
import java.util.Scanner;

// Replace ___ with your code
public class Lay_dau_vao_so_nguyen {
    public static void main(String[] args) {
     
        // create object of Scanner
        Scanner input = new Scanner(System.in);
     
        // take input value for number
        int number = input.nextInt();
     
        System.out.println(number);
     
        // close the Scanner object
        input.close();
    }
}
