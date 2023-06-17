package STACK.Questions;

import java.util.Stack;

public class Min_Stack_155 {

}
//  getMin operation in O(N) time complexity
//class MinStack {
//    Stack<Integer> stack;
//    public MinStack() {
//        stack = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//    }
//
//    public void pop() {
//        stack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        Stack<Integer> temp = new Stack<>();
//        int min = Integer.MAX_VALUE;
//        while (!stack.isEmpty()){
//            int val = stack.pop();
//            if(val < min){
//                min = val;
//            }
//            temp.push(val);
//        }
//
////        RE-FILL MAIN STACK
//        while (!temp.isEmpty()){
//            stack.push(temp.pop());
//        }
//
//        return min;
//    }
//}

class MinStack {
    private class Pair{
        int data;
        int current_min;
        public Pair(int data , int previous_Min){
            this.data = data;
            if(data < previous_Min){
                current_min = data;
            }
            else{
                current_min = previous_Min;
            }
        }
    }

    private Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        int previous_min;
        if(stack.isEmpty()){
            previous_min = Integer.MAX_VALUE;
        }
        else {
            previous_min = stack.peek().current_min;
        }

        Pair ob = new Pair(val, previous_min);
        stack.push(ob);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().data;
    }

    public int getMin() {
        return stack.peek().current_min;
    }
}
