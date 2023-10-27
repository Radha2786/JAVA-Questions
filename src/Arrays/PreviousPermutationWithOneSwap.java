package Arrays;
import java.util.*;
public class PreviousPermutationWithOneSwap {
    public static void main(String[] args) {
        int[] arr = {1,9,4,6,7};
        int[] nums=arr;
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
//       for(int i=0;i<arr.length ; i++){
//           if(arr[i]>max){
//               max=arr[i];
//           }
//           if(arr[i]>max && arr[i]>max2){
//               max2=arr[i];
//           }
//       }
        Arrays.sort(arr);
        int second_largest=arr[arr.length-2];
        for(int i=0;i>
        Swap(2,)



    }
    public static void Swap(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
