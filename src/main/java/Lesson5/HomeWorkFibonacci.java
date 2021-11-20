package Lesson5;

public class HomeWorkFibonacci {
    public static void main (String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= 15; i++) {
            System.out.print(a + " ");
            a = a + b;
            b = a - b;
        }

        System.out.println();
    }
}
