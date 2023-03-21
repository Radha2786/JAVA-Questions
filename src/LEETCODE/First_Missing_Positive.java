package LEETCODE;

import java.util.*;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums = {2,1,4,7,4,8,3,6,4,7};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length ; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int n = max;
        int pos=0;
        int[] frequency = new int[n+1];
        for(int i=0;i<nums.length ;i++){
            if(nums[i]>=0){
                pos=nums[i];
                frequency[pos]++;
            }

        }
        for(int i=1 ; i<frequency.length;i++){
            if(frequency[i]<=0){
//                return i;
                System.out.println(i);
                return;
            }
        }
//        return -1;
        System.out.println(n+1);

    }
}
