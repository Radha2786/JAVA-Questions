package LinkedList.Questions;

import java.util.List;
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Middle_of_the_Linked_List {
//    Definition for singly-linked list.


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode ob1 = new ListNode(arr[0]);
        ListNode ob2 = new ListNode(arr[1]);
        ListNode ob3 = new ListNode(arr[2]);
        ListNode ob4 = new ListNode(arr[3]);
        ListNode ob5 = new ListNode(arr[4]);

        ob1.next = ob2;
        ob2.next = ob3;
        ob3.next = ob4;
        ob4.next = ob5;

        display(ob1);

    }
    static void display(ListNode temp){
          while (temp!=null){
              System.out.print(temp.val + " -> ");
              temp = temp.next;
          }
        System.out.println("NULL");
    }

    static ListNode middleNode(ListNode head) {
          int size = size(head);
          ListNode temp = head;
          for(int i = 1 ; i <= size/2 ; i++){
              temp = temp.next;
          }
          return temp;
    }

    static int size(ListNode head){
          int count = 0;
          while (head != null){
              count++;
              head = head.next;
          }

          return count;
    }
}

