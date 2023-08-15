package chapter_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai_tap_su_dung_LinkedList_duoi_dang_hang_doi {
    public static void main(String[] args) {

        // create a LinkedList of Integer type
        LinkedList<Integer> numberList = new LinkedList<>();

        // add elements to numberList
        numberList.add(5);
        numberList.add(10);
        numberList.add(15);

        // remove element from the front 
        numberList.poll();

        // take an integer input from the user
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // add the user input to the end of numberList
        numberList.offer(number);

        // print numbersList
        System.out.println(numberList);
        
        input.close();
    }
}
