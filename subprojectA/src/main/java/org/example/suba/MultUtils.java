package org.example.suba;

public class MultUtils {
    public static int mult(int x, int y) {
        return x*y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }

    public static boolean quotient(int x, int y) {
        return x / y == 0;
    }

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
