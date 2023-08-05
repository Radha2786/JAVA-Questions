package Contests;
import java.util.*;

public class Count_Complete_Subarrays_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,2};
        HashSet<Integer> hashset = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if (!hashset.contains(arr[i]))
            {
                hashset.add(arr[i]);
            }
        }
        int count=0;
//        System.out.println(hashset);
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> newset = new HashSet<>();
            for(int j=i;j<arr.length;j++){
                newset.add(arr[j]);
                if(newset.size()==hashset.size()){
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}
