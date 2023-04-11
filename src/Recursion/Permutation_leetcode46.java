package Recursion;

import java.util.ArrayList;

public class Permutation_leetcode46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] frequency = new boolean[nums.length];
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
        Permutation(nums,list,ll,frequency);
        System.out.println(ll);
    }

    private static void Permutation(int[] nums, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ll,boolean[] frequency) {
        if(list.size()==nums.length){
            ll.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(frequency[i]!=true){
                list.add(nums[i]);
                frequency[i]=true;
                Permutation(nums,list,ll,frequency);
                list.remove(list.size()-1);
                frequency[i]=false;
            }
        }
    }


}
