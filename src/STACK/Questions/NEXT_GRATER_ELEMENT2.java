package STACK.Questions;

import java.util.Stack;
import java.util.Arrays;

public class NEXT_GRATER_ELEMENT2 {
    public static void main(String[] args) {
        int[] arr={1,5,2,3,4,3};
        int[] ans=nextGrater2(arr);
        System.out.println(Arrays.toString(ans));

    }



    public static int[] nextGrater2(int[] arr){
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
//        int i=0;
//        while(ans[i]==-1){
//
//        }

            for(int j=0;j<arr.length ;j++){
                while(arr[j] > arr[stack.peek()]) {
                    int index = stack.pop();
                    ans[index] = arr[j];
                }
            }


        while (!stack.isEmpty()){
            int index = stack.pop();
            ans[index] = -1;
        }


        return ans;
    }
}
