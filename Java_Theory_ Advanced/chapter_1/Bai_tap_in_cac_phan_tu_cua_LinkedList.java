package chapter_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai_tap_in_cac_phan_tu_cua_LinkedList {
    public static void main(String[] args) {

        // create an LinkedList of String called names
        LinkedList<String> names = new LinkedList<>();
        
        // take 3 String input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();
        
        // add name1, name2, name3 to names
        names.add(name1);
        names.add(name2);
        names.add(name3);

        // loop through the LinkedList
        for (String name : names) {

            // print name
            System.out.println(name);
        }
        
        input.close();
    }
}
