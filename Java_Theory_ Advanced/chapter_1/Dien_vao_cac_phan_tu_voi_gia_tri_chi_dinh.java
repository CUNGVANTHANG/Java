package chapter_1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Dien_vao_cac_phan_tu_voi_gia_tri_chi_dinh {
    public static void main(String[] args) {

        // create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // take input from user
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        String text3 = input.nextLine();
        
        // add text1, text2, text3 to the linkedlist
        languages.add(text1);
        languages.add(text2);
        languages.add(text3);
        
        // fill every element with random
        Collections.fill(languages, "random");
        
        // print the list
        System.out.println(languages);

        input.close();
    }
}
