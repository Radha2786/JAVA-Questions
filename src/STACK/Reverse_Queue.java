package STACK;

import QUEUE.MeraQueue;

public class Reverse_Queue {
    public static void main(String[] args) throws Exception {
        MeraQueue ob = new MeraQueue();
        ob.enqueue(10);
        ob.enqueue(20);
        ob.enqueue(30);
        ob.enqueue(40);
        ob.display();
        reverse(ob);
        ob.display();

    }
    static void reverse(MeraQueue ob) throws Exception {
        if(ob.isEmpty()){
//            ob.enqueue(data);
            return ;
        }
        int data = ob.dequeue();
//        ob.enqueue(data);
        reverse(ob);
        ob.enqueue(data);

    }
}
