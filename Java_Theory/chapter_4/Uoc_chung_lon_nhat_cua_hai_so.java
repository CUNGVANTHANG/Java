package chapter_4;

import java.util.Scanner;

public class Uoc_chung_lon_nhat_cua_hai_so {
    
    // Hàm tính ước chung lớn nhất (UCLN) bằng thuật toán Euclid
    int findGCD (int num1, int num2) {
      while(num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
      }
      
      return num1;
    }
    
    public static void main(String[] args) {

        // get input values for two numbers
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        Uoc_chung_lon_nhat_cua_hai_so obj = new Uoc_chung_lon_nhat_cua_hai_so();

        // call the findGCD() method
        int gcd = obj.findGCD(number1, number2);
        System.out.println(gcd);

        input.close();
    }

}
