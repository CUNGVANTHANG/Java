package chapter_4;

import java.util.Scanner;

public class In_kieu_du_lieu_bat_ky {
    // create a generics method
    // pass T data as a parameter
    public<T> void display(T data) {

        // print data
        System.out.println(data);
    }

    public static void main(String[] args) {

        // create object of Main class
        In_kieu_du_lieu_bat_ky obj = new In_kieu_du_lieu_bat_ky();

        // take string input from the user
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();

        // call generics method and pass input1
        obj.<String>display(input1);

        input.close();
    }
}
