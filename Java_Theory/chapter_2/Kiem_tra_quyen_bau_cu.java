package chapter_2;

import java.util.Scanner;

public class Kiem_tra_quyen_bau_cu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for age
        int age = input.nextInt();

        // check if the person is eligible to vote
        if (age >= 18) {
          System.out.println("Can Vote");
        } 
        else System.out.println("Cannot Vote");
         
        input.close();
    }
}
