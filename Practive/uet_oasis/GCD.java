package uet_oasis;

public class GCD {
    static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            a = -a;
            b = -b;
        }

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
