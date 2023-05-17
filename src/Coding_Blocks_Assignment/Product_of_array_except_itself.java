package Coding_Blocks_Assignment;
import java.util.*;

public class Product_of_array_except_itself {
    public static void main(String[] args) {
        int[] arr = {2,4,3,6};
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] ans= new int[arr.length];
        left[0]=1;
        right[arr.length-1]=1;
        for(int i=1;i<arr.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        for(int i=arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
