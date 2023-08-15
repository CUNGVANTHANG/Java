package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Tao_arraylist_luu_tru_du_lieu_ky_tu {
    public static void main(String[] args) {

        // create Character ArrayList
        ArrayList<Character> charList = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        char char1 = input.next().charAt(0);
        char char2 = input.next().charAt(0);
        char char3 = input.next().charAt(0);
        char char4 = input.next().charAt(0);

        // add elements to charList
        charList.add(char1);
        charList.add(char2);
        charList.add(char3);
        charList.add(char4);

        // iterate through charList
        for (int i = 0; i <= 3; ++i) {

            // print the charList using get()
            System.out.println(charList.get(i));

        }
        
        input.close();
    }
}
