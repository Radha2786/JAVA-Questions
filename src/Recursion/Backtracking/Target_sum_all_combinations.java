package Recursion.Backtracking;

import java.util.ArrayList;

public class Target_sum_all_combinations {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
        allCombinations(arr , target , "" , 0);
        allCombinationsInArrayList(arr , target , 0 , list , ll);
        System.out.println(ll);
    }

    static void allCombinations(int[] arr , int target , String ans , int index){
        if(target == 0){
            System.out.println(ans);
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index ; i < arr.length ; i++){
            allCombinations(arr , target - arr[i] , ans+arr[i] , i);
        }
    }

    static void allCombinationsInArrayList(int[] arr , int target , int index , ArrayList<Integer> list , ArrayList<ArrayList<Integer>> ll){
        if(target == 0){
//            System.out.println(list);
            ll.add(new ArrayList<>(list));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index ; i < arr.length ; i++){
//            Making changes in ArrayList
            list.add(arr[i]);
            allCombinationsInArrayList(arr , target-arr[i] , i , list , ll);
//            Undo changes
            list.remove(list.size() - 1);

        }

    }

}
