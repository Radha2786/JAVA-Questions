package Arrays.Sorting;
import java.util.*;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr ={2,8,1,0,20};
        for(int i=0;i<arr.length;i++){
            int min_indx= i;
            for(int j=i+1 ; j<arr.length;j++){
                if(arr[j]<arr[min_indx]){
                    min_indx=j;
                }
            }
            // swapping after finding out minimum
            int t = arr[min_indx];
            arr[min_indx]=arr[i];
            arr[i]=t;

        }
        System.out.println(Arrays.toString(arr));
    }
}
