package chapter_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai_tap_them_phan_tu_vao_linkedlist_tai_chi_so_xac_dinh {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // add elements to languages
        languages.add("Java");
        languages.add("Python");

        // take input from user
        Scanner input = new Scanner(System.in);
        String language1 = input.nextLine();

        // insert the user input to language LinkedList
        languages.add(1, language1);

        // print languages
        System.out.println(languages);
        
        input.close();
    }
}
