package Arrays.Two_D;
import java.util.*;

public class SubArray_sums_divisible_by_k {
    public static void main(String[] args) {
        int[] arr = {-1,-9,-4,0};
        int k =9;
        System.out.println(count_of_arrays(arr,k));
    }
    public static long count_of_arrays(int[] arr, int k){
        int[] frequency= new int[arr.length];
        frequency[0]=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            sum=sum%k;
            if(sum<0){
                sum=sum+k;
            }
            if(sum<frequency.length){
                frequency[sum]=frequency[sum]+1;
            }
        }
        long ans=0;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>=2){
                ans+=(frequency[i]*(frequency[i]-1))/2;
            }
        }
        return ans;

    }
}
