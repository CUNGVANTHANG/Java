package uet_oasis.week3;

public class Fibonacci {
    static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n < 2) {
            return n;
        }

        long f0 = 0;
        long f1 = 1;

        for (int i = 2; i <= n; i++) {
            long fn = f0 + f1;
            if (fn < f0 || fn < f1) {
                return Long.MAX_VALUE;
            }
            f0 = f1;
            f1 = fn;
        }

        return f1;
    }
}
