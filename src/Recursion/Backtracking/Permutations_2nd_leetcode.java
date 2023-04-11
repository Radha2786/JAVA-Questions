package Recursion.Backtracking;
import java.util.*;

public class Permutations_2nd_leetcode {
    public static void main(String[] args) {
//        int[] nums ={1,1,2};
        int[] nums = {2,2,1,1};
        List<List<Integer>> ll = new ArrayList<>();
        Permutation(0,nums,ll);
//        return ll;
        System.out.println(ll);
    }
    public static void Permutation(int index,int[] nums, List<List<Integer>> ll) {
        if(index==nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length ; i++){
                list.add(nums[i]);
            }
            ll.add(new ArrayList<>(list));
            return ;
        }
        for(int i=index ; i<nums.length ; i++){
            int num = nums[i];
            boolean flag = false;
            for(int j=i+1; j<nums.length ; j++){
                if(num==nums[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            Swap(i,index,nums);
            Permutation(index+1,nums,ll);
            // backtrack swapping
            Swap(i,index,nums);

        }

    }
    public static void Swap(int i , int j,int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
