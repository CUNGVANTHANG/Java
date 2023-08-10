package chapter_10;

import java.util.Scanner;

class Addition {

    // add() method with integer parameters
    // add parameters and print the result
    public void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    // add() method with string parameters
    // join parameters and print the result
    public void add(String first, String second) {
        System.out.println(first + second);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get integer input for number1 and number2
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // get string input for first and second
        String first = input.next();
        String second = input.next();

        // create an object of Addition
        Addition obj = new Addition();

        // call add() with integer parameters
        obj.add(number1, number2);

        // call add() with string parameters
        obj.add(first, second);

        input.close();
    }
}
