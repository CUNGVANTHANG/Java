package Recursive;

import java.util.Scanner;

class thap_ha_noi {
    public static Scanner scanner = new Scanner(System.in);

    static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.err.println("Disk " + n + " moved from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n;
        n = scanner.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
