package Coding_Blocks_Assignment;

import java.util.Scanner;

public class Vivek_Loves_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(loves_Array(arr , 0 , n-1));
        }
    }

    static int loves_Array(int[] arr , int s , int e){
        int point = 0;

        for(int mid = s ; mid < e ; mid++){

//            LEFT SIDE
            int left = 0;
            for(int i = s ; i <= mid ; i++){
                left += arr[i];
            }

//            RIGHT SIDE
            int right = 0;
            for(int i = mid+1 ; i <= e ; i++){
                right += arr[i];
            }

            if(left == right){
                int f1 = loves_Array(arr , s , mid);
                int f2 = loves_Array(arr , mid+1 , e);

                return Math.max(f1 , f2) + 1;
            }
        }

        return point;
    }
}
