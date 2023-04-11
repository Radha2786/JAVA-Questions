package LEETCODE;

public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] arr={1,1,1};
        int k =2;
        int s =0, e=0,sum=0;
        int count=0;
        while(e<arr.length){
            sum+=arr[e];
            while(sum>k){
                sum-=arr[s];
                s++;
            }
            if(sum==k){
                count++;
            }
            e++;
        }
//        return count;
        System.out.println(count);
    }

}
