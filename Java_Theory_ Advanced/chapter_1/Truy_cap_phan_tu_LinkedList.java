package chapter_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Truy_cap_phan_tu_LinkedList {
    public static void main(String[] args) {

        // create an LinkedList of String type
        LinkedList<String> series = new LinkedList<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to series
        series.add(input1);
        series.add(input2);
        series.add(input3);

        // get element at index 2 using get()
        String name = series.get(2);

        // print name
        System.out.println(name);
        input.close();
    }
}
