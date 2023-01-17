package LEETCODE;

import java.util.Arrays;

public class Smallest_Value_of_the_Rearranged_Number_2165 {
    public static void main(String[] args) {
        long num = -9990001239l;
        System.out.println(smallestNumber(num));

    }
    static long smallestNumber(long num){
        if(num > 0){
            return positiveNumber(num);
        }else {
            return negativeNumber(num);
        }
    }

    static long positiveNumber(long num){
        int[] digits = new int[10];

        //COUNT THE FREQUENCY OF DIGITS
        while (num > 0){
            int t = (int) (num % 10);
            digits[t]++;
            num = num/10;
        }
        System.out.println(Arrays.toString(digits));
        String ans = "";
        for(int i = 1 ; i < 10 ; i++){
            if(digits[i] != 0){
                while (digits[i] > 0){
                    ans += i;
                    System.out.println(ans);
                    if(digits[0] != 0){
                        while (digits[0] > 0) {
                            ans += '0';
                            digits[0]--;
                            System.out.println(ans);
                            System.out.println(Arrays.toString(digits));
                        }
                    }


                    digits[i]--;
                    System.out.println(Arrays.toString(digits));

                }
            }
        }

        return Long.parseLong(ans);

    }

    static long negativeNumber(long num){

        num = num*-1;

        int[] digits = new int[10];

        //COUNT THE FREQUENCY OF DIGITS
        while (num > 0){
            int t = (int) (num % 10);
            digits[t]++;
            num = num/10;
        }
        System.out.println(Arrays.toString(digits));
        String ans = "";
        for(int i = 9 ; i >= 0 ; i--){
            if(digits[i] != 0){
                while (digits[i] > 0){
                    ans += i;
                    System.out.println(ans);
                    digits[i]--;
                    System.out.println(Arrays.toString(digits));

                }
            }
        }

        return Long.parseLong(ans)*-1;
    }
}
