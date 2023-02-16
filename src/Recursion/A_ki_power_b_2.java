package Recursion;

public class A_ki_power_b_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println(power(a , b));
    }

    static int power(int a , int b){
        if(b == 0){
            return 1;
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
