package chapter_2;

import java.util.Scanner;

public class May_tinh_tu_tao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for operator
        String op = input.next();

        // get input value for first and second
        double first = input.nextDouble();
        double second = input.nextDouble();

        switch (op) {
        // perform operations based on the value of op
        // hint: follow this format
        // case "+":
        //     System.out.println(first + second);
        //     break;

        // use cases:
        // case "+": for addition
        // case "-": for subtraction
        // case "*": for multiplication
        // case "/": for division
          case "+":
            System.out.println(first + second);
            break;
          case "-":
            System.out.println(first - second);
            break;
          case "*":
            System.out.println(first * second);
            break;
          case "/":
            System.out.println(first / second);
            break;

        // if op doesn't match with any cases
          default:
            System.out.println("Invalid Operator");
        }

        input.close();
    }
}
