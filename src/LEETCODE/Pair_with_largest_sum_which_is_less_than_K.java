package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;

public class Pair_with_largest_sum_which_is_less_than_K {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m =arr.length;
        int p=0;
        int row_length =arr.length;
        int n = arr[0].length;
        int col_length = arr[0].length;
        int no_of_diagonal = m+n-1;
        int[] ans = new int[m*n];
        for(int i=0;i<no_of_diagonal;i++) {
            int r = 0;
            int c = 0;
            if (i < col_length) {
                r = 0;
                c = i;
            } else {
                r = i - col_length + 1;
                c = col_length - 1;
            }
            ArrayList<Integer> list = new ArrayList<>();
            while (r < row_length && c >=0) {
                list.add(arr[r][c]);
                r++;
                c--;
            }
            if (i % 2 == 0) {
                for (int j = list.size() - 1; j >= 0; j--) {
                    ans[p] = list.get(j);
                    p++;
                }
            } else {
                for (int j = 0; j < list.size(); j++) {
                    ans[p] = list.get(j);
                    p++;
                }
            }
        }
        System.out.println((Arrays.toString(ans)));
    }
}
