package chapter_1;

import java.util.HashSet;

public class On_tap_HashSet {
    public static void main(String[] args) {
 
        // set of even numbers
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("Set1: " + evenNumbers);
 
        // set of prime numbers
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(1);
        primeNumbers.add(3);
        System.out.println("Set2: " + primeNumbers);
 
        // get all union of two sets
        evenNumbers.addAll(primeNumbers);
        System.out.println("Union: " + evenNumbers);
 
        // get intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection: " + evenNumbers);
    }
}
