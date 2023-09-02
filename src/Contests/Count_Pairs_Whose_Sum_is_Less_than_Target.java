package Contests;
import java.util.*;

public class Count_Pairs_Whose_Sum_is_Less_than_Target {
    public static void main(String[] args) {
//        int[] arr ={-6,2,5,-2,-7,-1,3};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(-6);
        arr.add(2);
        int target = -2;
        int count=0;
        for(int i=0;i<arr.size()-1;i++){
            for (int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)<target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
