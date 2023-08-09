package chapter_5;

import java.util.Scanner;

public class Kiem_tra_hai_chuoi_bang_nhau {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
     
        // take input values for both string
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        // compare two strings using equals()
        if (str1.equals(str2)) {
            System.out.println("Equal");
        }

        else {
            System.out.println("Not Equal");
        }

        input.close();
    }
}
