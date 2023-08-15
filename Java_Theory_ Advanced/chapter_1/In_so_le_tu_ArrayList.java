package chapter_1;

import java.util.ArrayList;

public class In_so_le_tu_ArrayList {
    public static void main(String[] args) {
 
        // create an ArrayList Integer
        ArrayList <Integer> numbers = new ArrayList<>();
 
        // add elements to numbers
        numbers.add(100);
        numbers.add(201);
        numbers.add(300);
        numbers.add(411);
 
        for (int i = 0; i <= 3; ++i) {
            // check for odd numbers
            if (numbers.get(i) % 2 != 0) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
