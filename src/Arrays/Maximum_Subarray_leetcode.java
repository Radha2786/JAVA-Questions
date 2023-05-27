package Arrays;
import java.util.*;

public class Maximum_Subarray_leetcode {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int ans=0;
            for(int j=i;j< arr.length;j++){
                ans+=arr[j];
                if(ans>max){
                    max=ans;
                }
            }
        }
        System.out.println(max);
    }
}
