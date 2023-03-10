package Recursion.Backtracking;

public class Target_sum_all_permutations {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        int target = 10;
        allPermutations(arr , target , "");
    }

    static void allPermutations(int[] arr , int target , String ans){
        if(target == 0){
            System.out.println(ans);
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = 0 ; i < arr.length ; i++){

//            EXPLICIT
//            target -= arr[i];

            allPermutations(arr , target - arr[i] , ans+arr[i]);

//            UNDO CHANGES
//            target += arr[i];
        }
    }
}
