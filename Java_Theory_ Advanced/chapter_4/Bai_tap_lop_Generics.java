package chapter_4;

import java.util.Scanner;

class MyClass<T> {

    // create a constructor with parameter T data
    public MyClass(T data) {

        // print data
        System.out.println(data);
    }
}

public class Bai_tap_lop_Generics {
    public static void main(String[] args) {

        // take input from the user
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        // create object of MyClass object and pass number to it
        MyClass<Double> doubleObj = new MyClass<>(number);

        input.close();
    }
}
