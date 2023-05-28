package Coding_Blocks_Assignment;
import java.util.*;

public class Next_Permutation {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,4,3,1};
        int p =0;
        int q =0;
        // finding smallest element from last
        for(int i=arr.length-2 ; i>=0 ;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        // finding element greater than p from last
        for(int i=arr.length-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        if(p==0 && q==0){
            Reverse(arr , 0,arr.length-1);
            return ;
        }
        // swapping
        int temp = arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        // reversing remaining elements in ascending order after p
        Reverse(arr,p+1,arr.length-1);

    }
    static void Reverse(int[] arr , int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
