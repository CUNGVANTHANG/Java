import java.util.Scanner;

public class uoc_chung_thu_k {
    public static int UCLN_thu_k(int x, int y, int k) {
        int small = Math.min(x, y);

        int count = 1;
        for (int i = 2; i <= small; i++) {
            if (x % i == 0 && y % i == 0)
                count++;
            if (count == k)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int k = input.nextInt();

        System.out.println(UCLN_thu_k(x, y, k));

        input.close();
    }
}
