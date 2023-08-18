package chapter_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Di_tim_Nemo {
    public static void main(String[] args) {

        // create an ArrayList of string called fish
        ArrayList<String> fish = new ArrayList<>();

        // take 3 input from user
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to fish
        fish.add(input1);
        fish.add(input2);
        fish.add(input3);

        // search nemo in fish
        int pos = Collections.binarySearch(fish, "nemo");

        // check if nemo is present in fish ArrayList
        if (pos >= 0) {
            // print pos
            System.out.println(pos);
        } 
        else {
            // print Not Found
            System.out.println("Not Found");
        }
        input.close();
    }
}
