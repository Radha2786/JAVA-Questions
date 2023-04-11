package Coding_Blocks_Assignment;
import java.util.*;
public class Replace_all_0_with_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Replace5(n,0);

    }
    static void Replace5(int n ,int num){
        if(n==0){
            int ans=0;
            while(num>0){
                int rem = num%10;
                ans=ans*10+rem;
                num=num/10;
            }
            System.out.println(ans);
            return ;
        }
        int mod = n%10;
        if(mod==0){
            num=(num*10)+5;
        }else{
            num = (num*10)+mod;
        }
        Replace5(n=n/10,num);


    }
}
