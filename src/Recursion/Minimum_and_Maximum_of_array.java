//Recursive Programs to find Minimum and Maximum elements of array

package Recursion;
import java.util.Arrays;

public class Minimum_and_Maximum_of_array {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int  min = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int i=0;

        Min_func(arr,i,min,max);
    }
    static void Min_func(int[] arr,int i,int min,int max){
        if(i>=arr.length){
            System.out.println(min +" "+max);
            return;
        }
        if(arr[i]>max) {
             Min_func(arr, i + 1, min,max = arr[i]);
        }else if(arr[i]<min){
            Min_func(arr,i+1,min=arr[i],max);
        }else{
             Min_func(arr,i+1,min,max);
        }
    }
}
