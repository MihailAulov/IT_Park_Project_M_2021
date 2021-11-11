package Lesson3;

public class HomeWorkTwo {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(calculateFactorial(9));
    }
}
