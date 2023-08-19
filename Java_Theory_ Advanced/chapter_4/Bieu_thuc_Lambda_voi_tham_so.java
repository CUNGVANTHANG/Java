package chapter_4;

// Replace ___ with your code
import java.util.Scanner;

// create a functional interface
@FunctionalInterface
interface Subtraction {

    // create a void method subtract
    void subtract(int x, int y);
}

class Bieu_thuc_Lambda_voi_tham_so {

    public static void main(String[] args) {

        // implement the functional interface using lambda expressions
        Subtraction obj = (x, y) -> System.out.println(x - y);

        // take two int input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // call the subtract method
        obj.subtract(num1, num2);

        input.close();
    }
}