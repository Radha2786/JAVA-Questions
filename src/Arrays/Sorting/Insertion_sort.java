package Arrays.Sorting;
import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {8,9,2,4,17,6};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
