package chapter_2;

import java.util.Scanner;

public class Tim_nguoi_nho_tuoi_nhat {
    public static void main(String[] args) {

        // get input values for jack, roman and johnny
        Scanner input = new Scanner(System.in);
        int jack = input.nextInt();
        int roman = input.nextInt();
        int johnny = input.nextInt();

        // use if else to find the youngest brother
        String min = (roman < jack) ? 
                  (roman < johnny) ? "Roman" : "Johnny" :
                  (jack < johnny) ? "Jack" : "Johnny";
        
        System.out.println(min);

        input.close();
    }
}
