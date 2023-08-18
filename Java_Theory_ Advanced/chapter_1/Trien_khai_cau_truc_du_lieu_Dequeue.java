package chapter_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Trien_khai_cau_truc_du_lieu_Dequeue {
    public static void main(String[] args) {

        // create a LinkedList of String type
        LinkedList<String> movies = new LinkedList<>();

        // take input from the user
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // use add() to insert input1 to movies
        movies.add(input1);

        // use AddFirst() to insert input2 at the beginning of movies
        movies.addFirst(input2);

        // Use addLast() to insert input3 at the end of movies
        movies.addLast(input3);

        // print movies
        System.out.println(movies);

        // remove element from the beginning of movies
        movies.removeFirst();

        // remove element from the end of the movies
        movies.removeLast();

        // print movies
        System.out.println(movies);

        input.close();
    }
}
