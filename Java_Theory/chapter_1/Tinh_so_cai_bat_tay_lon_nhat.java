package chapter_1;

import java.util.Scanner;

public class Tinh_so_cai_bat_tay_lon_nhat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // get input value for students
        int students = input.nextInt();

        // find the possible handshakes and print it
        int combination = (students * (students - 1)) / 2;
        
        System.out.println(combination);

        input.close();
    }
}
