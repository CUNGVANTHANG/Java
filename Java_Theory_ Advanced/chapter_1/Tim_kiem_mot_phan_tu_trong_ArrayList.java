package chapter_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tim_kiem_mot_phan_tu_trong_ArrayList {
    public static void main(String[] args) {

        // create an ArrayList of integers called numberList
        ArrayList<Integer> numberList = new ArrayList<>();

        // add elements
        numberList.add(12);
        numberList.add(34);
        numberList.add(67);
        numberList.add(100);
        
        // take an int input from the user
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();

        // search element in arraylist
        int pos = Collections.binarySearch(numberList, element);
                
        // print pos
        System.out.println(pos);

        input.close();
    }
}
