package Arrays;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int  target = 9;
        int[] brr = twoSum(nums , target);
        System.out.println(Arrays.toString(brr));
    }

    static int[] twoSum(int[] nums, int target) {
//        int[] arr = ;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
//                    arr[0]=i;
//                    arr[1]=j;
                    return new int[]{i , j};
                }
            }
        }
       return new int[]{-1 , -1};
    }
}
