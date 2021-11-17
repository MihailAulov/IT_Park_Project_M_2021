package Lesson4;

public class HomeWork {

    public static void main(String[] args) {

        System.out.println(sqrt(81));

    }

    public static int sqrt(int n) {
        int l = 0;
        int r = n;
        int m = (l + r) / 2;
        int t = n;
        for (;;) {
            m = (l + r) / 2;
            if (m == t || m * m == n)
                break;
            if (m * m < n) {
                l = m;
            } else {
                r = m;
            }
            t = m;
        }
        return m;
    }
}




