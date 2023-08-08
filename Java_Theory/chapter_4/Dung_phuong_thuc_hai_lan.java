package chapter_4;

public class Dung_phuong_thuc_hai_lan {

    // create a method to print two numbers 5 and 100
    void printNumbers() {
        System.out.println(5);
        System.out.println(100);
    }

    public static void main(String[] args) {

        // object of Main class
        Dung_phuong_thuc_hai_lan obj = new Dung_phuong_thuc_hai_lan();

        // call the method two times using obj
        obj.printNumbers();
        obj.printNumbers();
    }

}
