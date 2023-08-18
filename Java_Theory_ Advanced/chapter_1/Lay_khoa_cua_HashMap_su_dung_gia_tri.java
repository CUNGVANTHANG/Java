package chapter_1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Lay_khoa_cua_HashMap_su_dung_gia_tri {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<Integer, String> names = new HashMap<>();
        
        // put elements in the hashmap
        names.put(1, "Ryan");
        names.put(2, "Jeff");
        names.put(3, "Tim");

        // value whose key is to be searched
        String value = "Tim";

        // loop through each entry of hashmap
        for (Entry<Integer, String> entry : names.entrySet()) {

            // check if give value is equal to value from entry
            if (entry.getValue() == value) {
                // print the corresponding key
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
