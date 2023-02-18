package LEETCODE;

public class Monotonic_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,0};
        System.out.println(monotonic(nums));
    }
    static boolean monotonic(int[] nums){
        boolean increasing_flag=true;
        boolean decreasing_flag=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                increasing_flag = false;
            }
            if(nums[i]<nums[i+1]){
                decreasing_flag = false;
            }
        }
        return increasing_flag || decreasing_flag;

                }


    }

