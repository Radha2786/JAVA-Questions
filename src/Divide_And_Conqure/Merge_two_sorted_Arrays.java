package Divide_And_Conqure;

import java.util.Arrays;

public class Merge_two_sorted_Arrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] ans = merged_two_sorted_Arrays(arr1 , arr2);
        System.out.println(Arrays.toString(ans));

    }

    static int[] merged_two_sorted_Arrays(int[] a , int[] b){
        int[] ans = new int[a.length + b.length];

        int p1 = 0 , p2 = 0 , p3 = 0;

        while(p1 < a.length && p2 < b.length){
            if(a[p1] < b[p2]){
                ans[p3] = a[p1];

                p1++;
            }
            else{
                ans[p3] = b[p2];

                p2++;
            }
            p3++;
        }

        while (p1 < a.length){
            ans[p3] = a[p1];

            p1++;
            p3++;
        }

        while (p2 < b.length){
            ans[p3] = b[p2];

            p2++;
            p3++;
        }

        return ans;
    }

}
