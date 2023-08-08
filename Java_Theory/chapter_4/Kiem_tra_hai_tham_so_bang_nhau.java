package chapter_4;

import java.util.Scanner;

public class Kiem_tra_hai_tham_so_bang_nhau {

    // create method with two arguments
    void myMethod(int n1, int n2) {

        // compare two arguments
        // if they are equal, print Arguments are Equal.
        // Otherwise, print Arguments are not Equal
        if (n1 == n2) {
          System.out.println("Arguments are Equal");
        }
        else {
          System.out.println("Arguments are not Equal");
        }
    }

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        // get input values for two numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // create an object of Main
        Kiem_tra_hai_tham_so_bang_nhau obj = new Kiem_tra_hai_tham_so_bang_nhau();

        // use obj to call the method with number1 and number2 arguments
        obj.myMethod(number1, number2);

        input.close();
    }
}
