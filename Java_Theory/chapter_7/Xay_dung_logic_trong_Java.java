package chapter_7;

public class Xay_dung_logic_trong_Java {
    boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    void printPrime(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 100;
        Xay_dung_logic_trong_Java obj = new Xay_dung_logic_trong_Java();
        obj.printPrime(n1, n2);
    }
}
