package chapter_11;

import java.util.Scanner;

// create a class name College
class College {

    // create a static field name
    static String name;

    // create a static method display() and print the value of name
    static void display() {
        System.out.println(name);
    }
}

class Truy_cap_vao_cac_thuoc_tinh_static_cua_lop_khac {

    // create main() method
    public static void main(String[] args) {

        // take input for college name
        Scanner input = new Scanner(System.in);
        String inputName = input.nextLine();

        // set the value of static field as user input
        College.name = inputName;

        // call the static method using its class name
        College.display();
        input.close();
    }
}
