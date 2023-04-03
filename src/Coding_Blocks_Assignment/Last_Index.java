package Coding_Blocks_Assignment;
import java.util.*;

public class Last_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(LastIndex(arr,m,arr.length-1));
    }
    static int LastIndex(int[] arr , int target,int index){
        if(arr[index]==target){
            return index;
        }
        if(index==0){
            return -1;
        }
        return LastIndex(arr,target,index-1);




    }
}
