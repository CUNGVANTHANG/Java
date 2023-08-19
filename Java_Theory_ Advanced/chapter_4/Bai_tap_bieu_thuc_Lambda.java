package chapter_4;

// Replace ___ with your code
import java.util.Scanner;

// create a functional interface
@FunctionalInterface
interface Subtraction {

    // create a void method subtract
    void subtract();
}

class Bai_tap_bieu_thuc_Lambda {

    public static void main(String[] args) {
        
        // take two int input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // create an anonymous class that implements subtract() interface
        // subtract() method must print the result of num1 - num2
        Subtraction obj = () -> System.out.println(num1 - num2);

        // call the subtract method
        obj.subtract();

        input.close();
    }
}