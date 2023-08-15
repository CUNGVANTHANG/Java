package chapter_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiem_tra_mot_phan_tu_co_trong_ArrayList_khong {
    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<String> courses = new ArrayList<>();

        // add elements to the arraylist
        courses.add("Java");
        courses.add("C++");
        courses.add("Psychology");

        // take an input from the user
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // check if courses contain text
        boolean result = courses.contains(text);
        
        // print the result
        System.out.println(result);
        
        input.close();
    }
}
