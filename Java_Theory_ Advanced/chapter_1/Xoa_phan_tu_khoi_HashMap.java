package chapter_1;

import java.util.HashMap;

public class Xoa_phan_tu_khoi_HashMap {
    public static void main(String[] args) {

        // create HashMap of String key & Integer value
        HashMap<String, Integer> name = new HashMap<>();

        // add elements to name
        name.put("Patrick", 1);
        name.put("SpongeBob", 2);

        // print name
        System.out.println(name);

        // remove element with key Patrick
        name.remove("Patrick");

        // print name again
        System.out.println(name);
    }
}
