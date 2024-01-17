import java.util.Scanner;
import java.lang.Math;

public class tro_choi_so_hoc {
    public static int primeFactors(int n) {
        int sum = 0;
        while (n % 2 == 0) {
            sum += 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }

        if (n > 2) {
            sum += n;
        }

        return sum;
    }

    public static int factorSum(int n) {
        while (n != primeFactors(n)) {
            n = primeFactors(n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.err.println(factorSum(n));

        input.close();
    }
}
