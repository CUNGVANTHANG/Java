package chapter_1;

import java.util.HashSet;

public class Bai_tap_tim_hieu_cua_hai_HashSet {
    public static void main(String[] args) {

         // create a HashSet
        HashSet<Integer> numSetOne = new HashSet<>();

        // add elements to numSetOne
        numSetOne.add(2);
        numSetOne.add(3);
        numSetOne.add(4);

        // create another HashSet
        HashSet<Integer> numSetTwo = new HashSet<>();

        // add elements to numSetTwo
        numSetTwo.add(3);
        numSetTwo.add(4);
        numSetTwo.add(5);

        // find difference of sets
        numSetOne.removeAll(numSetTwo);

        // print numSetOne
        System.out.println(numSetOne);
    }
}
