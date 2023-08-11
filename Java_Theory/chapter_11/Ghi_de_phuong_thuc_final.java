package chapter_11;

import java.util.Scanner;

class Ghi_de_phuong_thuc_final {

    // create a final method setName() without any parameter
    // print Programiz inside the method
    final void setName() {
        System.out.println("Tek4vn");
    }

    // create a final method setName() with a string parameter name
    final void setName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        // create an object of Main
        Ghi_de_phuong_thuc_final obj = new Ghi_de_phuong_thuc_final();

        // get input value for the name
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // call setName() without any argument
        obj.setName();

        // call setName with the name argument
        obj.setName(name);

        input.close();
    }
}
