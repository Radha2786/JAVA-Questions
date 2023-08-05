package LinkedList.Questions;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Insert_Greatest_Common_Divisors_in_Linked_List {
    public static void main(String[] args) {
        LinkedList question = new LinkedList();
        question.addAtLast(18);
        question.addAtLast(6);
        question.addAtLast(10);
        question.addAtLast(3);
        Node head = question.getHead();
//        System.out.println(head.data);

        Node temp=head;
        while(temp.next!=null){
            Node ans = new Node(0);
            int min=Math.min(temp.data,temp.next.data);
            while(min>=0){
                if(temp.data%min==0 && temp.next.data %min==0){
                    // ListNode ans= new ListNode(min);
                    ans.data=min;
                    break;
                }
                min--;
            }
            Node temp2=temp.next;
            temp.next=ans;
            ans.next=temp2;
            temp=temp2;
        }
//        return head;
//        System.out.println(head);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }


}
