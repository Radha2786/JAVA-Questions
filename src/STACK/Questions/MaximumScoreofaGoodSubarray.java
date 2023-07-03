package STACK.Questions;

import java.util.Stack;

public class MaximumScoreofaGoodSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 7, 4, 5};
        int k = 3;
        int ans=Valid_Interval(arr, k);
        System.out.println(ans);

    }

    public static int Valid_Interval(int[] arr, int k) {
        Stack<Integer> stack = new Stack<>();
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int R = i;
                int h = arr[stack.pop()];
                if (R - 1 >= k) {
                    if (!stack.isEmpty()) {
                        int L = stack.peek();
                        if (L + 1 <= k) {
                            ans = Math.max(ans, h * (R - L - 1));
                        }
                    } else {
                        ans = Math.max(ans, h * R);
                    }
                }
            }
            stack.push(i);
        }
        int R = arr.length;
        while (!stack.isEmpty()) {
            int h = arr[stack.pop()];
            if (!stack.isEmpty()) {
                int L = stack.peek();
                if (L + 1 <= k) {
                    ans = Math.max(ans, h * (R - L - 1));
                }
            } else {
                ans = Math.max(ans, h * R);
            }

        }
        return ans;
    }
}
