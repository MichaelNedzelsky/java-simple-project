package org.example.subb;

public class PowerUtils {
    public static int pow(int x, int y) {
        return (int) Math.pow(x, y);
    }

    public static int iteratedPower(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
