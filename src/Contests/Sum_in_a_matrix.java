package Contests;
import java.util.*;

public class Sum_in_a_matrix {
    public static void main(String[] args) {
        int ans=0;

        int[][] nums  = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};

        int[] arr = new int[nums.length];
        for(int k=0;k<nums[0].length;k++){
            int max=0;
            int max2=0;
            int index=0;
            int m =0;
            for(int i=0;i<nums.length ; i++){
                for(int j=0;j<nums[i].length;j++){
                    if(nums[i][j]>max){
                        max=nums[i][j];
                        index=j;
                    }
                }
                nums[i][index]=0;
                arr[m]=max;
                m++;
            }
            for(int n=0;n<arr.length;n++){
                if(arr[n]>max2){
                    max2=arr[n];
                }
            }
            ans+=max2;

        }
//        return ans;
        System.out.println(ans);
    }
}
