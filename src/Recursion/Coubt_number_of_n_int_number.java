package Recursion;

public class Coubt_number_of_n_int_number {
    public static void main(String[] args) {
        int n = 0;
        int number = 1000110;

//        THROUGH GLOBAL VARIABLE
//        count_n(number);
//        System.out.println(count);


        System.out.println(sum_of_digits(number , n));

    }
//    static int count = 0;
//    static void count_n(int n){
////        BASE CONDITION
//        if(n == 0){
//            return;
//        }
//
//        int digit = n%10;
//        if(digit == 0){
//            count++;
//        }
//
//        count_n(n/10);
//    }

    static int sum_of_digits(int n , int check){
        if(n == 0){
            return 0;
        }
        int digit = n%10;
        if(digit == check){
            return 1 + sum_of_digits(n/10 , check);
        }else {
            return sum_of_digits(n / 10 , check);
        }
    }
}
