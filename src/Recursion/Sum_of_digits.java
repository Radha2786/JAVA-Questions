package Recursion;

public class Sum_of_digits {
    public static void main(String[] args) {
//        int n=24,sum=0;
//        digits(n,sum);
        int n = 24;
        System.out.println(sum_o_digits(n));
    }
//    static void digits(int n,int sum){
//        if(n==0){
//            System.out.println(sum);
//            return ;
//        }
//        sum += n%10;
////        System.out.println( sum=sum+n%10);
//        digits(n/10,sum);
//    }

    static int sum_o_digits(int n){
        if(n == 0){
            return 0;
        }

        int digit = n%10;
        return digit + sum_o_digits(n/10);
    }
}
