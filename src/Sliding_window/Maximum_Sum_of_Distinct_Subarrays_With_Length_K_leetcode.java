package Sliding_window;
import java.util.*;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K_leetcode {
    public static void main(String[] args) {
        int[] nums = {4,4,4};
        int k =  3;
        int s=0 , e=0;
        int max=0;
        // making window
        while(e<k){
            boolean flag = false;
            // if element gets reapeated
            for(int i=0 ; i<e ; i++){
                if(nums[i]==nums[e]){
                    e++;
                    flag = true;
                    break;
                }
            }
            if(flag){
                max+=nums[e];
            }
//            max+=nums[e];
            e++;
        }
        int current = max;
        while(e<nums.length){
            boolean flag=false;
            // grow
            for(int j=0; j<e ; j++){
                if(nums[j]==nums[e]){
                    e++;
                    flag=true;
                    break;
//                    continue;
                }
            }
            if(flag){
                current+=nums[e];
                current-=nums[s];
            }
//            current+=nums[e];
            // shrink
//            current-=nums[s];
            if(current>max){
                max=current;
            }
            s++;
            e++;
        }
        System.out.println(max);

    }
}
