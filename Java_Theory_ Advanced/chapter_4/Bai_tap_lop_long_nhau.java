package chapter_4;

import java.util.Scanner;

class Song {

    // create a nested class named Artist
    class Artist {

        // create a method named getName()
        void getName(String name) {
            System.out.println(name);
        }
    }
}

public class Bai_tap_lop_long_nhau {
    public static void main(String[] args) {

        // create object of outer class
        Song s1 = new Song();

        // create object of inner class
        Song.Artist l1 = s1.new Artist();

        // take an string input from the user
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // call method of inner class
        l1.getName(name);
        
        input.close();
    }
}
