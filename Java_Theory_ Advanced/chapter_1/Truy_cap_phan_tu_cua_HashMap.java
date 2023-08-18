package chapter_1;

import java.util.HashMap;
import java.util.Scanner;

public class Truy_cap_phan_tu_cua_HashMap {
    public static void main(String[] args) {

        // create Map of Integer key & String value
        HashMap<Integer, String> numMap = new HashMap<>();

        // add elements to numMap
        numMap.put(1, "one");
        numMap.put(2, "two");

        // take int input from the user
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        // access value of numMap with key index 
        String value = numMap.get(index);

        // print value
        System.out.println(value);

        input.close();
    }
}
