package GFG;

public class Repetitive_Addition_Of_Digits {
    public static void main(String[] args) {
        System.out.println(singleDigit(100));
    }
    static int singleDigit(long N){
        while (N > 9){
            int n = sum_of_digits(N);
            N = n;
        }
        return (int) N;
    }

    static int sum_of_digits(long n){
        int SOD = 0;
        while (n > 0){
            SOD += n%10;
            n /= 10;
        }
        return SOD;
    }
}
