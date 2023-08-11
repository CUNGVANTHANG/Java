package chapter_11;

import java.util.Scanner;

class Company {

    // create a static field
    static String name;

    // create a static method
    static void printName() {
        System.out.println(name);
    }
}

class Bai_tap_tu_khoa_static_1 {

    // main method
    public static void main(String[] args) {

        // take an String input for name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // set the value of static variable
        Company.name = name;

        // call the static method
        Company.printName();

        // close the Scanner object
        input.close();
    }
}
