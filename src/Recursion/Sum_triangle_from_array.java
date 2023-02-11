package Recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] temp =arr;
        sum(arr);
        System.out.println(Arrays.toString(temp));
    }
    static void sum(int[] arr){

        if(arr.length==1){
            return;

        }
        int[] arr2 = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr2[i]=arr[i]+arr[i+1];
        }
        sum(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
