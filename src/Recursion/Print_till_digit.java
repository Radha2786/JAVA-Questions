package Recursion;

public class Print_till_digit {
    public static void main(String[] args) {
        int n=5;
        Print_digits(n);
    }
    static void Print_digits(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        Print_digits(n-1);
    }
}
