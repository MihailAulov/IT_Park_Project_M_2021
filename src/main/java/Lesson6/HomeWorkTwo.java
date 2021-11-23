package Lesson6;

public class HomeWorkTwo {

    public static long[] feld;

    public static long fib2(long n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            if (feld[(int) n - 1] != -1) {
                return feld[(int) n];
            } else {
                long result = fib2(n-1) + fib2(n-2);
                feld[(int) n - 1] = result;
                return result;
            }
        }
    }

    public static void main(String[] args) {
        long n = 10;
        feld = new long[(int) n];
        for (int i = 0; i < n; i++) {
            feld[i] = -1;
        }
        long result = fib2(n);
        System.out.println("Result: " + result);
    }
}
