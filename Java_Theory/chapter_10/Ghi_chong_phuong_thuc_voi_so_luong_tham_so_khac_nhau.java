package chapter_10;

import java.util.Scanner;

class Addition {

    // create addNumbers() method with 2 parameters
    // create add parameters and print the result
    public void addNumbers(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    // create addNumbers() method with 4 parameters
    // create add parameters and print the result
    public void addNumbers(int n1, int n2, int n3, int n4) {
        System.out.println(n1 + n2 + n3 + n4);
    }
}

class Ghi_chong_phuong_thuc_voi_so_luong_tham_so_khac_nhau {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get integer input
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();

        // create an object of Addition
        Addition obj = new Addition();

        // call addNumbers() with n1 and n2 arguments
        obj.addNumbers(n1, n2);

        // call addNumbers() with n1, n2, n3, and n4 arguments
        obj.addNumbers(n1, n2, n3, n4);

        input.close();
    }
}
