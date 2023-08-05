package chapter_2;

import java.util.Scanner;

public class Vi_du_xay_dung_logic {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
 
        int n2 = input.nextInt();
 
        int n3 = input.nextInt();
 
        // Kết quả là "true" nếu n1 lớn hơn n2 và n1 lớn hơn n3
        // Vậy bạn hãy điền thử logic trong này xem sao nhé
        if ((n1 > n2) && (n1 > n3)){
          System.out.println("true");
        }
        else System.out.println("false");

        input.close();
      }
}
