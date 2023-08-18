package chapter_1;

import java.util.HashMap;

public class Luyen_tap_thay_doi_phan_tu_cua_HashMap {
    public static void main(String[] args) {

        // create HashMap of String key & Integer value
        HashMap<String, Integer> name = new HashMap<>();

        // add elements to name
        name.put("Jimmy", 1);
        name.put("Chandler", 2);

        // print name
        System.out.println(name);

        // change 1 to 100
        name.replace("Jimmy", 100);

        // print name again
        System.out.println(name);
    }
}
