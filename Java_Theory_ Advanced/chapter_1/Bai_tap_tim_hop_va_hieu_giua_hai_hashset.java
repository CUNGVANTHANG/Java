package chapter_1;

import java.util.HashSet;

public class Bai_tap_tim_hop_va_hieu_giua_hai_hashset {
    public static void main(String[] args) {

        // create a hashset of Integer type
        HashSet<Integer> evenNumbers = new HashSet<>();

        // add elements to the hashset
        evenNumbers.add(2);
        evenNumbers.add(42);

        // create another hashset of Integer type
        HashSet<Integer> primeNumbers = new HashSet<>();

        // add elements to the hashset
        primeNumbers.add(2);
        primeNumbers.add(3);

        // find union of hashsets
        evenNumbers.addAll(primeNumbers);

        // print evenNumbers
        System.out.println(evenNumbers);

        // find difference between hashsets
        evenNumbers.removeAll(primeNumbers);

        // print evenNumbers
        System.out.println(evenNumbers);
    }
}
