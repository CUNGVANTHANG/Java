package chapter_1;

import java.util.HashSet;

public class Tim_hieu_cua_hai_HashSet {
    public static void main(String[] args) {

        // create a HashSet
        HashSet<String> name1 = new HashSet<>();

        // add elements to name1
        name1.add("Shakira");
        name1.add("Rihanna");
        name1.add("Taylor");

        // create a HashSet
        HashSet<String> name2 = new HashSet<>();

        // add elements to name2
        name2.add("Rihanna");
        name2.add("Taylor");
        name2.add("Beyonce");

        // find difference of sets
        name1.removeAll(name2);

        // print name1
        System.out.println(name1);
    }
}
