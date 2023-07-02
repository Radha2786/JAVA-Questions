package LinkedList;

import LinkedList.LinkedList;

public class Cycle_Removal {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);
        list.addAtLast(5);
        list.addAtLast(6);
        list.addAtLast(7);
        list.addAtLast(8);
        list.addAtLast(9);
        list.addAtLast(10);

//        list.display();

        Node cyclePoint = list.getNode(3);

        Node tail = list.getTail();
        tail.next = cyclePoint;

//        list.display();

        Node head = list.getHead();

        cycleRemoval(head);
        list.display();

    }

    static void cycleRemoval(Node head){

        Node meetingPoint = cycleDetection(head);

        if(meetingPoint == null){
            return;
        }

//        Node temp = meetingPoint;
//        int length = 1;
//        while (temp.next != meetingPoint){
//             temp = temp.next;
//             length++;
//        }
//
//        Node first = head;
//        for (int i = 1 ; i <= length ; i++){
//            first = first.next;
//        }
//
//        Node second = head;
//
//        while (first.next != second.next){
//            first = first.next;
//            second = second.next;
//        }
//
//        first.next = null;

        Node first = meetingPoint;
        Node second = head;
        while (first.next != second.next){
            first = first.next;
            second = second.next;
        }

        first.next = null;
    }

    static Node cycleDetection(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return fast;
            }

        }

        return null;
    }
}
