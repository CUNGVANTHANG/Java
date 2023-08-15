package chapter_1;

import java.util.ArrayList;

public class Lay_kich_thuoc_cua_ArrayList {
    public static void main(String[] args) {
        
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();
 
        // insert element to the arraylist
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);
 
        // get the number of elements of arraylist
        int size = languages.size();
        System.out.println("Length of ArrayList: " + size);
 
    }
}
