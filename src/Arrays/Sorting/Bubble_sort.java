package Arrays.Sorting;
import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr ={2,8,1,0,20};
        for(int pass=1 ; pass <arr.length ; pass++){
            for(int i=0;i<arr.length-pass;i++){
                if(arr[i]>arr[i+1]){
                    // swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
