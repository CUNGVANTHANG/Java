package chapter_1;

import java.util.HashMap;

public class Luyen_tap_truy_cap_phan_tu_cua_HashMap {
    public static void main(String[] args) {

        // create Map of Integer key & String value
        HashMap<Integer, String> song = new HashMap<>();

        // add elements to song
        song.put(1, "yesterday");
        song.put(2, "21 guns");
        

        // access value of song with key 2
        String value = song.get(2);

        // print value
        System.out.println(value);
    }
}
