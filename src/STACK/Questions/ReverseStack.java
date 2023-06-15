package STACK.Questions;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        Reverse_stack(stack);
        System.out.println(stack);
    }
    public static void Reverse_stack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int x = stack.pop();
        Reverse_stack(stack);
        AddBottom(stack,x);

    }
    public static void AddBottom(Stack<Integer> stack,int x){
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int data=stack.pop();
        AddBottom(stack,x);
        stack.push(data);
    }
}
