package chapter_4;

import java.util.Scanner;

//create a generics class
class PrintData<T> {

    // create a constructor with parameter T data
    public PrintData(T data) {
    
      // print the value of data
      System.out.println(data);
    }
}

public class In_gia_tri_thuoc_kieu_du_lieu_bat_ky {
    public static void main(String[] args) {

      // take an integer input
      Scanner input = new Scanner(System.in);
      int input1 = input.nextInt();
    
      // create an object of PrintData object with Integer data
      PrintData<Integer> data = new PrintData<>(input1);
     
      input.close();
    }
}
