package Contests;

public class SumofValuesatIndicesWithKSetBits {
    public static void main(String[] args) {
        int[] nums = {5,10,1,5,2};
        int k = 1;
        int ans=0;
        int n = nums.length;
        int j=0;
        while(j<nums.length){
            int ones=0;
            int i=j;
            while(i>0) {
                if (i % 2 == 1) {
                    ones++;
                }

                i = i / 2;
            }
            if (ones == k) {
                ans += nums[j];
            }
            j++;
        }
        System.out.println(ans);
    }
}
