package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_tap_thay_doi_phan_tu_cua_arraylist {
    public static void main(String[] args) {

        // create an ArrayList of String called names
        ArrayList<String> names = new ArrayList<>();

        // add Jeremy, Jules & Howard to names
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");

        // take String input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();

        //  replace the value in index 1 with name1
        names.set(1, name1);

        // print names again
        System.out.println(names);

        input.close();
    }
}
