package chapter_4;

import java.util.Scanner;

public class Boi_chung_nho_nhat_cua_hai_so {
    // create the findLCM() method with parameters: num1 and num2
    // compute lcm of two values and return it
    int findGCD (int num1, int num2) {
      while(num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
      }
      
      return num1;
    }
    
    int lcm (int num1, int num2) {
      return (num1 * num2) / findGCD(num1, num2);
    }

    public static void main(String[] args) {

        // get input values for x and y
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        Boi_chung_nho_nhat_cua_hai_so obj = new Boi_chung_nho_nhat_cua_hai_so();
        
        // call findLCM() with arguments number1 and number2
        int lcm = obj.lcm(number1, number2);
                
        System.out.println(lcm);

        input.close();
    }

}
