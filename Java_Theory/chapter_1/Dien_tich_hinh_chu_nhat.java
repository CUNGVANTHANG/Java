package chapter_1;

import java.util.Scanner;

public class Dien_tich_hinh_chu_nhat {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // take input for length and breadth
        int length = input.nextInt();
        int breadth = input.nextInt();
     
        // calculate area of rectangle   
        int area = length * breadth;
        System.out.println(area);

        input.close();
    }
}
