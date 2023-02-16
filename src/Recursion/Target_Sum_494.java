package Recursion;

public class Target_Sum_494 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;
        System.out.println(operation(arr , target , 0 , 0 , ""));
    }

    static int operation(int[] arr , int target , int index , int sum , String ans){
        if(index == arr.length){
            System.out.println(ans);
            if(sum == target){
                System.out.println("found");
                return 1;
            }
            else{
                System.out.println("NOT FOUND");
                return 0;
            }
        }

        int count = 0;
//        choose +
        count+= operation(arr , target , index+1 , sum+arr[index] , ans+'+'+arr[index]+" ");
//        choose -
         count+= operation(arr , target , index+1 , sum-arr[index] , ans+'-'+arr[index]+" ");
        
        return count;
    }
}
