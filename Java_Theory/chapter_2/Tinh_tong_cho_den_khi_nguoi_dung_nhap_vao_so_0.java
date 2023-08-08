package chapter_2;

import java.util.Scanner;

public class Tinh_tong_cho_den_khi_nguoi_dung_nhap_vao_so_0 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        // run a while loop that breaks only if input value is 0
        // take input value for number inside the loop
        // if input value is other than 0, add the value to sum
        while(true) {
          number = input.nextInt();
          if (number == 0) {
            break;
          }
          sum += number;
        }
        
        // print the sum
        System.out.println(sum);
        
        input.close();
    }
}
