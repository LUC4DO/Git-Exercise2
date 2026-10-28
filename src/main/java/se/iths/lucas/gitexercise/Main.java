package se.iths.lucas.gitexercise;

public class Main {
    static void main() {
        IO.println(maxB(4, 9));
        IO.println(maxA(6, 7));
        IO.println(maxB(4,9));
        IO.println(roundB(3.14159));
        IO.println(parseIntB("42"));

        IO.println(parseDoubleB("12.5"));
    }

    public static int maxB(int val1, int val2) {
        return Math.max(val1, val2);
    }

    public static int maxA(int val1, int val2) {
        return Math.max(val1, val2);
    }

    public static long roundB(double val){
        return Math.round(val);
    }

    public static int parseIntB(String s){
        return Integer.parseInt(s) + 8;
    }
    public static double parseDoubleB(String s){
        return Double.parseDouble(s) + 0.5;
    }
}
