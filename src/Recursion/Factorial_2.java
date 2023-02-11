package Recursion;

public class Factorial_2 {
    public static void main(String[] args) {
        int n=5;
       int t= factorial(n , 1);
        System.out.println(t);
    }
    static int factorial(int n , int ans){
        if(n==0){
            return ans;
        }
//        int f=factorial(n-1);
        return factorial(n-1 , ans*n);
    }
}
