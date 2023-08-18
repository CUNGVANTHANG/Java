package chapter_1;

import java.util.HashMap;

public class In_cac_phan_tu_cua_HashMap {
    public static void main(String[] args) {

        // create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // add elements
        students.put(1, "Jack");
        students.put(3, "Zayn");
        students.put(5, "Emily");

        // loop through key elements
        for (Integer key : students.keySet()) {

            // get the value of key using get()
            System.out.println(students.get(key));
        }

    }
}
