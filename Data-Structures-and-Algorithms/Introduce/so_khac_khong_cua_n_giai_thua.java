import java.util.Scanner;

public class so_khac_khong_cua_n_giai_thua {
    public static int digit[] = { 1, 1, 2, 6, 4, 2, 2, 4, 2, 8 };

    public static int lastNon0Digit(int n) {
        if (n < 10) {
            return digit[n];
        }

        // Chữ số thứ 2 từ dưới lên là chẵn
        if (((n / 10) % 10) % 2 == 0) {
            return (6 * lastNon0Digit(n / 5) * digit[n % 10]) % 10;
        } else {
            return (4 * lastNon0Digit(n / 5) * digit[n % 10]) % 10;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.err.println(lastNon0Digit(n));
        input.close();
    }
}
