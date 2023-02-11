package Recursion;

public class A_to_the_power_b {
    public static void main(String[] args) {
        int a =2;
        int b=4;
        int n=1,ans=1;
        int t=Power_of_a(a,b,n,ans);
        System.out.println(t);

    }
    static int Power_of_a(int a,int b,int n,int ans){
        if(n>b){
//            System.out.println(ans);
            return ans;
        }

        return Power_of_a(a,b,n+1,ans*a);
//        return ans*=a;
    }
}
