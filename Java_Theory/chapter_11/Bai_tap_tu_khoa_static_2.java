package chapter_11;

class Calculator {

    // create a static field name
    static String name = "Calculator";

    // create a static method with parameters n1 and n2
    static int add(int n1, int n2) {
        return n1 + n2;
    }
}

class Bai_tap_tu_khoa_static_2 {
    public static void main(String[] args) {

        // access the field name using the class name
        System.out.println(Calculator.name);

        // access the method add() with arguments 2 and 3 using the class name
        System.out.println(Calculator.add(2, 3));
    }
}
