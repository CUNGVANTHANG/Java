package chapter_1;

import java.util.HashMap;

public class Thay_doi_phan_tu_cua_HashMap {
    public static void main(String[] args) {

        // create HashMap of String key & Integer value
        HashMap<String, Integer> numMap = new HashMap<>();

        // add elements to numMap
        numMap.put("one", 1);
        numMap.put("two", 2);

        // print numMap
        System.out.println(numMap);

        // change 1 to 100
        numMap.replace("one", 100);

        // print numMap again
        System.out.println(numMap);
    }
}
