package chapter_1;

import java.util.ArrayList;

public class Them_phan_tu_vao_ArrayList_tai_chi_so_xac_dinh {
    public static void main(String[] args) {

        // create an Arraylist of String type
        ArrayList<String> movies = new ArrayList<>();

        // add Avatar to Arraylist
        movies.add("Avatar");

        // add Catch me if you can to Arraylist
        movies.add("Catch me if you can");

        // print the Arraylist
       System.out.println(movies);

        // add Batman at index 1
        movies.add(1, "Batman");

        // print the Arraylist
        System.out.println(movies);
    }
}
