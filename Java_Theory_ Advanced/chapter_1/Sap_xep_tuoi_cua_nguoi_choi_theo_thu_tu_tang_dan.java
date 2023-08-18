package chapter_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sap_xep_tuoi_cua_nguoi_choi_theo_thu_tu_tang_dan {
    public static void main(String[] args) {

        // create an ArrayList of Integer
        ArrayList<Integer> age = new ArrayList<>();

        // take three int input from user to store age
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        // add elements to age
        age.add(input1);
        age.add(input2);
        age.add(input3);

        // print age
        System.out.println(age);

        // sort elements of age
        Collections.sort(age);

        // print sorted age
        System.out.println(age);
        input.close();
    }
}
