package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Xoa_phan_tu_ArrayList {
    public static void main(String[] args) {

        // create an arraylist of String type
        ArrayList<String> languages = new ArrayList<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add input1, input2 & input3 to languages
        languages.add(input1);
        languages.add(input2);
        languages.add(input3);

        // remove element at index 1
        languages.remove(1);

        // print ArrayList
        System.out.println(languages);
        input.close();
    }
}
