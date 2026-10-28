package se.iths.lucas.gitexercise;

public class Main {
    static void main() {
        IO.println(maxB(4, 9));
        IO.println(maxA(6, 7));
        IO.println(maxB(4, 9));
        IO.println(roundB(3.14159));
        IO.println(roundA(1337.123456));
    }

    public static int maxB(int val1, int val2) {
        return Math.max(val1, val2);
    }

    public static int maxA(int val1, int val2) {
        return Math.max(val1, val2);
    }

    public static long roundB(double val) {
        return Math.round(val);
    }

    public static long roundA(double val) {
        return Math.round(val);
    }
}
