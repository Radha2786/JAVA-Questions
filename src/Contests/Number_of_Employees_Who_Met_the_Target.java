package Contests;
import java.util.*;

public class Number_of_Employees_Who_Met_the_Target {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4};
        int count=0;
        int target=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                count++;
            }
        }
        System.out.println(count);
    }
}
