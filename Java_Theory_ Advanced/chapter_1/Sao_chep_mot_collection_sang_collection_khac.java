package chapter_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sao_chep_mot_collection_sang_collection_khac {
    public static void main(String[] args) {

        // create an ArrayList of Integers
        ArrayList<Integer> src = new ArrayList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // add elements to src
        src.add(num1);
        src.add(num2);
        
        // create an ArrayList of Integers
        ArrayList<Integer> dest = new ArrayList<>();

        // add elements to dest
        dest.add(22);
        dest.add(33);

        // copy src to dest 
        Collections.copy(dest, src);
        System.out.println(dest);

        input.close();
    }
}
