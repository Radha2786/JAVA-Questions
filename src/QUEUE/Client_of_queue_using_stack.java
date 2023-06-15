package QUEUE;

//import STACK.MyQueue;
//import STACK.Queue_using_stacks;

public class Client_of_queue_using_stack {
    public static void main(String[] args) throws Exception {
        QueueUsingStack ob = new QueueUsingStack();

        ob.Enqueue(10);
        ob.Enqueue(20);
        ob.Enqueue(30);
        ob.Enqueue(40);
        System.out.println(ob.dequeue());
//        System.out.println(ob.dequeue());
//        System.out.println(ob.getFront());
        ob.display();


    }
}
