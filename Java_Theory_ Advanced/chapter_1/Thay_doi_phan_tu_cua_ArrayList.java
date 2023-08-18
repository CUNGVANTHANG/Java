package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Thay_doi_phan_tu_cua_ArrayList {
    public static void main(String[] args) {

        // create an ArrayList of Integer called marks
        ArrayList<Integer> marks = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add input1, input2, and input3 to marks
        marks.add(input1);
        marks.add(input2);
        marks.add(input3);

        // print the Arraylist
        System.out.println(marks);

        // modify the value of input2
        marks.set(1, 86);

        // print marks again
        System.out.println(marks);
        input.close();
    }
}
