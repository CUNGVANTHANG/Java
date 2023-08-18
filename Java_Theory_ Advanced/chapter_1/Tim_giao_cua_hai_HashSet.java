package chapter_1;

import java.util.HashSet;
import java.util.Scanner;

public class Tim_giao_cua_hai_HashSet {
    public static void main(String[] args) {

        // create a HashSet
        HashSet<String> wildAnimal = new HashSet<>();

        // take 3 String input from user
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();

        // add elements to wildAnimal
        wildAnimal.add(input1);
        wildAnimal.add(input2);
        wildAnimal.add(input3);

        // create another HashSet
        HashSet<String> domesticAnimal = new HashSet<>();

        // take 3 String input from user
        String input4 = input.nextLine();
        String input5 = input.nextLine();
        String input6 = input.nextLine();

        // add elements to domesticAnimal
        domesticAnimal.add(input4);
        domesticAnimal.add(input5);
        domesticAnimal.add(input6);

        // find intersection
        wildAnimal.retainAll(domesticAnimal);

        // print wildAnimal
        System.out.println(wildAnimal);
        input.close();
    }
}
