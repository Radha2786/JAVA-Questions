package STACK.Questions;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] ans= new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                int counted_value=i-stack.pop();
                ans[stack.pop()]=counted_value;


            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}
