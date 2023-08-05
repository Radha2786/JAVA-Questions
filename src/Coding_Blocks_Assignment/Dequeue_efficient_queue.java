package Coding_Blocks_Assignment;

import java.util.Stack;

public class Dequeue_efficient_queue {
        Stack<Integer> stack1 ;
        Stack<Integer> stack2;

       public Dequeue_efficient_queue(){
            stack1= new Stack<>();
            stack2 = new Stack<>();
        }

    public void enqueue(int data){
           stack1.push(data);
    }
    public int dequeue(){
           while(stack1.size()>1){
               stack2.push(stack1.pop());
           }
           int deleted_data=stack1.pop();
           while(stack2.size()>0){
               stack1.push(stack2.pop());
           }

           return deleted_data;
    }
    public boolean isEmpty(){
           return stack1.isEmpty();
    }
}
