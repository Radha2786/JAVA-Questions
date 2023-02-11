package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n));

    }
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int first=fibo(n-1);
//         first=n-1;
         int second=fibo(n-2);
//        return fibo(n,first,second);
        return first+second;
    }
}
