package LEETCODE;
import java.util.*;
public class Largest_Number {
    public static void main(String[] args) {
        int[] nums = {10,2};
        String str="";
        for(int i=0;i<nums.length;i++){
            str=str+nums[i];
        }
        System.out.println(str);
        int n =Integer.parseInt(str);
        System.out.println(n);
        int[] digits = new int[10];

        //COUNT THE FREQUENCY OF DIGITS
        while (n > 0){
            int t = (int) (n % 10);
            digits[t]++;
            n = n/10;
        }
//        System.out.println(Arrays.toString(digits));
        String ans = "";
        for(int i = 9 ; i >=0 ; i--){
            if(digits[i] != 0){
                while (digits[i] > 0){
                    ans += i;
                    System.out.println(ans);
//                    if(digits[0] != 0){
//                        while (digits[0] > 0) {
//                            ans += '0';
//                            digits[0]--;
//                            System.out.println(ans);
//                            System.out.println(Arrays.toString(digits));
//                        }
//                    }


                    digits[i]--;
//                    System.out.println(Arrays.toString(digits));

                }
            }
        }
    }
}
