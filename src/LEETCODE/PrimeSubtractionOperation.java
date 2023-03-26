package LEETCODE;

public class PrimeSubtractionOperation {
    public static void main(String[] args) {
       int[] nums = {4,9,6,10};
       int i=0,index=0;
       boolean flag = true;
       while(i<nums.length-1){
           if(nums[i]>nums[i+1]){
               index=i;
               flag=false;
               break;
           }
           i++;
       }
       if(flag==true){
           System.out.println("true");
       }else{
           int ele=nums[index];
           int prime=ele-2;
       }
    }
}
