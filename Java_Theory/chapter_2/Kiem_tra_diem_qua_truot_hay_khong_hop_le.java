package chapter_2;

import java.util.Scanner;

public class Kiem_tra_diem_qua_truot_hay_khong_hop_le {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get input value for marks
        int marks = input.nextInt();

        // check if user has entered valid marks or not
        // also check if the student passed or failed
        // hint: use if...else if ladder
        if (marks > 0 && marks < 100) {
          if (marks > 40) {
            System.out.println("Pass");
          }
          else System.out.println("Fail");
        }
        else {
          System.out.println("Invalid Marks");
        }
        
        input.close();
    }
}
