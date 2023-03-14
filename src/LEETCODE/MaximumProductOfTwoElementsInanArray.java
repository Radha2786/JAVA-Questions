package LEETCODE;

public class MaximumProductOfTwoElementsInanArray {
    public static void main(String[] args) {
        int[] nums =  {1,5,4,5};
        int max = Integer.MIN_VALUE;
        int index1=0,index2=0;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index1=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==index1){
                continue;
            }
            if(nums[i]>max2 && nums[i]<=max){
                max2=nums[i];
                index2=i;
            }
        }
//        return nums[index1]*nums[index2];
        System.out.println((nums[index1]-1)*(nums[index2]-1));
    }
}
