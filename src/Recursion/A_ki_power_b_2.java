package Recursion;


//Leetcode question 50.
public class A_ki_power_b_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = -2;
        if(b<0){
            double ans = power(a,b);
            System.out.println(1/ans);
        }else
        System.out.println(power(a , b));
    }

    static int power(int a , int b){
        if(b == 0){
            return 1;
        }
        if(b<0){
            b = Math.abs(b);
        }

        if(b%2 == 0){
            int ans = power(a , b/2);
            return ans * ans;
        }
        else {
            int ans = power(a , b/2);
            return ans * ans * a;
        }
    }
}
