package Contests;
import java.util.*;

public class Neither_MinimumnorMaximum {
    public static void main(String[] args) {
        int[] nums = {2,1,3};
        Arrays.sort(nums);
        if(nums.length>2){
            System.out.println(nums[nums.length/2]);
        }else{
//            return -1;
            System.out.println(-1);
        }
    }
}
