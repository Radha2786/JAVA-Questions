package Exams;

public class MyLinkedList {

    //    CREATING NODE
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node ob1 = new Node(10);
//        System.out.println("DATA -> " + ob1.data);
//        System.out.println("NEXT -> " + ob1.next);
        Node ob2 = new Node(20);
//        System.out.println("DATA -> " + ob2.data);
//        System.out.println("NEXT -> " + ob2.next);
        Node ob3 = new Node(30);
//        System.out.println("DATA -> " + ob3.data);
//        System.out.println("NEXT -> " + ob3.next);

        ob1.next = ob2;
        ob2.next = ob3;

        System.out.println("DATA -> " + ob1.data);
        System.out.println("NEXT -> " + ob1.next);
        System.out.println("DATA -> " + ob2.data);
        System.out.println("NEXT -> " + ob2.next);
        System.out.println("DATA -> " + ob3.data);
        System.out.println("NEXT -> " + ob3.next);
    }
}
