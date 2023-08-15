package chapter_1;

import java.util.HashSet;

public class Bai_tap_tao_HashSet {
    public static void main(String[] args) {

        // create a HashSet of Integer type
        HashSet<Integer> numSet = new HashSet<>();

        // add elements 2 and 3 to numSet
        numSet.add(2);
        numSet.add(3);

        // again add 2 to numSet again
        numSet.add(2);
       
        // print numSet
        System.out.println(numSet);
    }
}
