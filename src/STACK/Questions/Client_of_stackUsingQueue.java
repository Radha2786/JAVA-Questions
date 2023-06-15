package STACK.Questions;

import STACK.Queue_using_stacks;

public class Client_of_stackUsingQueue {
    public static void main(String[] args) throws Exception {
       StackUsingQueue ob = new StackUsingQueue();
       ob.push(10);
       ob.push(20);
       ob.push(30);
       ob.push(40);
        System.out.println(ob.pop());
        ob.display();
    }
}
