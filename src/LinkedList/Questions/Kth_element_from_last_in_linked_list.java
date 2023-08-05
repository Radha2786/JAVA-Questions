//package LinkedList.Questions;
//
//import LinkedList.LinkedList;
//import LinkedList.Node;
//
////1 2 3 4 5 6 -1
////        3
//
//public class Kth_element_from_last_in_linked_list {
//    public static void main(String[] args) {
//        LinkedList question = new LinkedList();
//        question.addAtLast(1);
//        question.addAtLast(2);
//        question.addAtLast(3);
//        question.addAtLast(4);
//        question.addAtLast(5);
//        question.addAtLast(6);
//        Node head = question.getHead();
//        Node ans= Kth_element(head,3);
//        System.out.println(ans.data);
//    }
//    public static Node Kth_element(Node head,int k){
//        int Size=size(head);
////        System.out.println(Size);
//        Node temp=head;
//        int i=1;
//        while(i<=k){
//            temp=temp.next;
//            i++;
//        }
//        return temp;
//
//
//    }
//    public static int size(Node head){
//        int count=0;
//        Node temp=head;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
//        return count;
//    }
//}
