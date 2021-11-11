package Lesson3;

import java.util.Scanner;

public class HomeWorkOne {

    public static void main(String[] args) {

        double a, b, c;
        double D;
        System.out.println("Программа решает квадратное уровнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a , b и c:");

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = b * b - 4 * a * c;
        if (D>0){
            Double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уровнения: x1 = " + x1 +", x2 = " + x2);

    }
        else if (D == 0) {
            double x;
            x = - b / (2 * a);
            System.out.println("Уровнение имеет единственный корень: x =" + x);
        }
        else
        {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }

}