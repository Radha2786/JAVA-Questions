package STACK;

import java.util.Stack;

public class Queue_using_stacks {

}
class MyQueue {
    private Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()){
            int d = stack.pop();
            temp.push(d);
        }

        int data = temp.pop();

        while (!temp.isEmpty()){
            int d = temp.pop();
            stack.push(d);
        }

        return data;
    }

    public int peek() {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()){
            int d = stack.pop();
            temp.push(d);
        }

        int data = temp.peek();

        while (!temp.isEmpty()){
            int d = temp.pop();
            stack.push(d);
        }

        return data;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
