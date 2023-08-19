package chapter_4;

import java.util.Scanner;

@FunctionalInterface
interface MultiplyNumbers {

    // create abstract method
    void multiply(int x, int y);
}

public class Luyen_tap_bieu_thuc_Lambda_voi_tham_so {
    public static void main(String[] args) {
    
      // implement the functional interface using lambda expressions
      MultiplyNumbers obj = (x, y) -> {
        System.out.println(x * y);
      };

      // take users input
      Scanner input = new Scanner(System.in);
      int input1 = input.nextInt();
      int input2 = input.nextInt();
    
      // call the multiply method
      obj.multiply(input1, input2);
      input.close();
    }
}
