package STACK.Questions;

import java.util.Stack;

public class NEXT_GRATER_ELEMENT {
    public static void main(String[] args) {

    }

    static int[] nextGrater(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){

//            IF ELEMENT GREATER THAN PREVIOUS ELEMENTS -> THEN WE WILL ASSIGN NEXT_GRATER OF THOSE ELEMENTS AS CURRENT ELEMENT
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int index = stack.pop();
                ans[index] = arr[i];
            }

//            PUSHING THE INDEX
            stack.push(i);
        }

        while (!stack.isEmpty()){
            int index = stack.pop();
            ans[index] = -1;
        }

        return ans;
    }
}
