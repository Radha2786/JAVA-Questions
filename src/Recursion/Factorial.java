package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int t = factorial(n);
        System.out.println(t);
    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int f = factorial(n-1);
        return n*f;
    }
}
