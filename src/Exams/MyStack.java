// Stack using LinkedList
package Exams;
class LL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}

public class MyStack extends LL{
    Node Head;

    MyStack(){
        Head = null;
    }
    //    H-7 -> -H6 -> 5 -> NULL
//    PUSH
    void push(int data){
        Node ob = new Node(data);
        ob.next = Head;

        Head = ob;
    }
    //    POP
    int pop(){
//        UNDERFLOW
        if(Head == null){
            System.out.println("STACK IS EMPTY");
            return -1;
        }

        int data_to_be_removed = Head.data;

        Head = Head.next;

        return data_to_be_removed;
    }

    //    PEEK
    int peek(){
        //        UNDERFLOW
        if(Head == null){
            System.out.println("STACK IS EMPTY");
            return -1;
        }

        return Head.data;
    }
    public static void main(String[] args) {
        MyStack ob = new MyStack();

        ob.push(10);
        ob.push(20);
        ob.push(30);

//        System.out.println(ob.peek());

        while (ob.Head != null){
            System.out.print(ob.pop() + " -> ");
        }
        System.out.println("NULL");
    }

}