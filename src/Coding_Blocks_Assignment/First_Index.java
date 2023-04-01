package Coding_Blocks_Assignment;
import java.util.*;

public class First_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(FirstIndex(arr ,m,0));
    }
    static int FirstIndex(int[] arr ,  int target , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return FirstIndex(arr,target,index+1);

    }
}
