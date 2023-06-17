package STACK.Questions;

import java.util.Stack;

public class Pattern_132 {
    public static void main(String[] args) {

    }

    static boolean does132exist(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int secondLargest = Integer.MIN_VALUE;
        for (int i = arr.length-1 ; i >= 0 ; i--){

//            AGAR KAHI SECOND LARGEST SE CHOTA ELEMENT MITA HAI TOH 132 PATTERN EXIST KARTA HAI.
            if(arr[i] < secondLargest){
                return true;
            }

//            WE WILL STORE THE SECOND-LARGEST ELEMENT HERE
            while (!stack.isEmpty() && arr[i] > stack.peek()){
                secondLargest = stack.pop();
            }

//            WE WILL STORE THE LARGEST ELEMENT IN THE STACK
            stack.push(arr[i]);
        }

        return false;
    }
}
