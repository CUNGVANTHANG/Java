package chapter_1;

import java.util.HashMap;

class Tao_va_Them_phan_tu_vao_HashMap {
    public static void main(String[] args) {

        // create HashMap of Integer key & String value
        HashMap<Integer, String> numMap = new HashMap<>();

        // add element
        numMap.put(1, "one");

        // add element
        numMap.put(2, "two");

        // print numMap
        System.out.println(numMap);
    }
}
