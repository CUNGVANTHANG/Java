package chapter_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Them_phan_tu_vao_LinkedList_tai_chi_so {
    public static void main(String[] args) {

        // create a LinkedList of String type named menu
        LinkedList<String> menu = new LinkedList<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to menu
        menu.add(input1);
        menu.add(input2);
        menu.add(input3);

        // print the LinkedList
        System.out.println(menu);

        // insert Pizza at index 1
        menu.add(1, "Pizza");

        // print menu
        System.out.println(menu);
        input.close();
    }
}
