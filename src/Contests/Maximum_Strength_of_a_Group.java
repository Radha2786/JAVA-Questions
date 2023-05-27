package Contests;
import java.util.*;

public class Maximum_Strength_of_a_Group {
    public static void main(String[] args) {
        int[] arr = {0,-1};
        Arrays.sort(arr);
        long product_max=1;
        int max = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        if(count%2!=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(i==count-1){
                    continue;
                }else if(arr[i]==0){
                    continue;
                } else{
                    product_max*=arr[i];
                }

            }
        } else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]==0){
                    continue;
                }else{
                    product_max*=arr[i];
                }

            }

        }
        if(product_max==1){
//            return max;
            System.out.println(max);
        }else {


            System.out.println(product_max);
        }
    }
}
