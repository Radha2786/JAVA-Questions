package Coding_Blocks_Assignment;
import java.util.*;

public class All_Indices_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        AllIndices(arr , m , 0);
    }
    static void AllIndices(int[] arr,int target , int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            System.out.print(index+" ");
        }
         AllIndices(arr,target,index+1);
    }
}

//5
//        3
//        2
//        1
//        2
//        3
//        2
