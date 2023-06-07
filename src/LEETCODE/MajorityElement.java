package LEETCODE;
import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
//        float count=0f;
//        int num=0;
//        float max = nums.length/2f;
//        for(int i=0;i<nums.length;i++){
//            count=0;
//            for(int j=i;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                    if(count>=max){
//                        max=count;
//                        num = nums[i];
//                    }
//                }
//
//            }
//
//        }
        Arrays.sort(nums);
        System.out.println(nums.length/2);
        int num =  nums[nums.length/2];
        System.out.println( nums[nums.length/2]);
//        return num;
//        System.out.println(num);
    }
}
