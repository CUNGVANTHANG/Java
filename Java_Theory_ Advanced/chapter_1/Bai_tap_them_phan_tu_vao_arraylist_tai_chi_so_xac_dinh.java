package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_tap_them_phan_tu_vao_arraylist_tai_chi_so_xac_dinh {
    public static void main(String[] args) {

        // create an Arraylist of String type
        ArrayList<String> names = new ArrayList<>();
        
        // add John to Arraylist
        names.add("John");

        // add Harry to Arraylist
        names.add("Harry");
        
        // take input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        
        // add name1 at index 1
        names.add(1, name1);

        // print the Arraylist
        System.out.println(names);

        input.close();
    }
}
