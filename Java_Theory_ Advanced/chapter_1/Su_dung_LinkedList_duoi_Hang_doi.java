package chapter_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Su_dung_LinkedList_duoi_Hang_doi {
    public static void main(String[] args) {

        // create a LinkedList of Integer type
        LinkedList<Integer> numbersList = new LinkedList<>();

        // take 3 int input from user
        Scanner input = new Scanner(System.in);

        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add elements
        numbersList.add(input1);
        numbersList.add(input2);
        numbersList.add(input3);

        // print numbersList
        System.out.println(numbersList);

        // remove element from the front
        numbersList.poll();

        // add element 20 at the end
        numbersList.offer(20);

        // print numbersList
        System.out.println(numbersList);
        input.close();
    }
}
