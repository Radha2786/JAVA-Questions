package STACK.Questions;

import java.util.Stack;

public class NEXT_SMALLER {
    public static void main(String[] args) {

    }

    static int[] nextSmaller(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1 ; i >= 0 ; i--){

            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]){
                int index = stack.pop();
                ans[index] = arr[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()){
            int index = stack.pop();
            ans[index] = -1;
        }

        return ans;
    }
}
