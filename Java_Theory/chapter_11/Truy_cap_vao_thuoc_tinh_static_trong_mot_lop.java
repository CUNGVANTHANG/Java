package chapter_11;

import java.util.Scanner;

class College {

    // create a static field, name
    static String name;

    // create a static method, display()
    // print the value of name
    static void display() {
        System.out.println(name);
    }

    // main method
    public static void main(String[] args) {

        // get input value for name
        Scanner input = new Scanner(System.in);
        String inputName = input.nextLine();

        // initialize the static field
        name = inputName;

        // call the static method
        display();

        input.close();
    }
}
