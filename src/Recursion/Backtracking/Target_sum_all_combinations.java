package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Target_sum_all_combinations {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        int target = 10;
        allPermutations(arr , target , "" , 0);
    }

    static void allPermutations(int[] arr , int target , String ans , int index){
        if(target == 0){
            System.out.println(ans);
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index ; i < arr.length ; i++){
            allPermutations(arr , target - arr[i] , ans+arr[i] , i);
        }
    }
}
