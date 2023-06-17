package STACK.Questions;
import java.util.*;

// next greater element 1 leetcode

import java.util.Stack;

public class Next_greater {
    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int value = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == value) {
                    arr[i] = nextGrater(nums2, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static int nextGrater(int[] arr, int ind) {
        int returned_ans = 0;
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = ind; i < arr.length; i++) {
            boolean flag = false;
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
//                ans[index] = arr[i];

                returned_ans = arr[i];
                flag = true;
//                break;
                return returned_ans;
            }
            stack.push(i);

        }

        return -1;
    }

}
