package STACK.Questions;

import java.util.Stack;

public class The_Celebrity_Problem {
    public static void main(String[] args) {
//        0 1 1 0
//        0 0 0 1
//        1 1 0 1
//        1 1 1 0
        int[][] arr ={
                {0, 1 ,1 , 0},
                {0, 0 ,0 , 1},
                {1, 1 ,0 , 1},
                {1 , 1 , 1 , 0}
        };

        System.out.println(celebrity(arr));
    }
    static int celebrity(int[][] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            stack.push(i);
        }

//        System.out.println(stack);
        while (stack.size() > 1){
            int p1 = stack.pop();
            int p2 = stack.pop();

            if(arr[p1][p2] == 0 && arr[p2][p1] == 1){
                stack.push(p1);
            }

            if(arr[p2][p1] == 0 && arr[p1][p2] == 1){
                stack.push(p2);
            }

//            System.out.println(stack);
        }

        if(stack.isEmpty()){
            return -1;
        }

        int potential = stack.pop();
        for(int i = 0 ; i < arr.length ; i++){
            if(i == potential){
                continue;
            }

            if(arr[i][potential] == 0){
                return -1;
            }
        }

        return potential;
    }
}
