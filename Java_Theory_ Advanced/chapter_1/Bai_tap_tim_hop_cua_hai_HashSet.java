package chapter_1;

import java.util.HashSet;

public class Bai_tap_tim_hop_cua_hai_HashSet {
    public static void main(String[] args) {

        // create an Integer HashSet 
        HashSet<Integer> numSetOne = new HashSet<>();

        // add elements to numSetOne
        numSetOne.add(2);
        numSetOne.add(3);
        numSetOne.add(4);
        
        // create another Integer HashSet 
        HashSet<Integer> numSetTwo = new HashSet<>();

        // add elements to numSetTwo
        numSetTwo.add(3);
        numSetTwo.add(4);
        numSetTwo.add(5);

        // find union 
        numSetOne.addAll(numSetTwo); 

        // print numSetOne
        System.out.println(numSetOne);
    }
}