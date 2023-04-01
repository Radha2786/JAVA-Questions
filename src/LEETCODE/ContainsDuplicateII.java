package LEETCODE;
import java.util.*;
import java.util.Arrays;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3} ;
        int k = 3;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1 ;i++){
            int j=i+1;
            if(nums[i]==nums[j] && j-i <=k){
//                return true;
                System.out.println(true);
                return ;
            }
        }
        System.out.println(false);
//        return false;
    }
}
