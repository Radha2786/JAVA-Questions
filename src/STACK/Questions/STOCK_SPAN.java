package STACK.Questions;

import java.util.Stack;

public class STOCK_SPAN {
    public static void main(String[] args) {
        int N = 7;
        int price[] ={100, 80, 60, 70, 60, 75, 85};

    }

    static int[] stockSpan(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = i+1;
            }
            else{
                ans[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return ans;
    }
}
