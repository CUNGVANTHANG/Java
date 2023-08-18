package chapter_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dao_nguoc_vi_tri_cua_cac_phan_tu {
    public static void main(String[] args) {

        // create an ArrayList of Integers
        ArrayList<Integer> numberList = new ArrayList<>();
        
        // take input from the user
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // add elements to numberList
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);

        // reverse the arraylist using reverse()
        Collections.reverse(numberList);
        
        // print the arraylist
        System.out.println(numberList);
        
        input.close();
    }
}
