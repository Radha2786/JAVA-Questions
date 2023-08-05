package Contests;
import java.util.*;
public class SumofSquaresofSpecialElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int product=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(n%(i+1)==0){
                product+=nums[i]*nums[i];
            }
        }
        System.out.println(product);
    }
}
