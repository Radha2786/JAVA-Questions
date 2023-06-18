package Contests;
import java.util.*;
public class FindtheValueofthePartition {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4};
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
                int value=Math.abs(nums[i]-nums[i+1]);
                if(value<=min){
                    min=value;
                }
//            }
        }
        System.out.println(min);
    }
}
