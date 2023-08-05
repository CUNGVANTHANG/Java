package chapter_1;

import java.util.Scanner;

public class Bai_toan_chia_keo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input values for chocolate and children
        int chocolate = input.nextInt();
        int children = input.nextInt();
        
        // find the number of chocolate each child gets
        // hint: use / operator
        int res1 = chocolate / children;
        
        // find the remaining chocolates
        // hint: use % operator
        int res2 = chocolate % children;

        // print the result values
        System.out.println(res1);
        System.out.println(res2);

        input.close();
    }
}
