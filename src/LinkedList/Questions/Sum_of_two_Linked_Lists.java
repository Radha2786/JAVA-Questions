package LinkedList.Questions;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Sum_of_two_Linked_Lists {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.addAtLast(5);
        l1.addAtLast(6);
        l1.addAtLast(3);
        l2.addAtLast(8);
        l2.addAtLast(4);
        l2.addAtLast(2);
        Node head1 = l1.getHead();
        Node head2 = l2.getHead();
        Node revl1=reverseList(head1);
        System.out.println(revl1.data);
        Node revl2=reverseList(head2);
        System.out.println(revl2.data);
        Node ans=sum(revl1,revl2);
        Node ans2=reverseList(ans);

        System.out.println(ans2.data);

    }

    public static Node sum (Node revl1,Node revl2){
        int carry=0;
        Node dummy = new Node();
        Node current=dummy;
        Node rev1=revl1;
        Node rev2=revl2;
        while(rev1!=null || rev2!=null){
            int sum1=0,sum2=0;
            if(rev1!=null){
                sum1+=rev1.data;
                rev1=rev1.next;
            }
            if(rev2!=null){
                sum2+=rev2.data;
                rev2=rev2.next;
            }
            int totalsum=sum1+sum2+carry;
            carry=totalsum/10;
            Node node = new Node(totalsum%10);

            current.next=node;
            current=current.next;

        }
        if(carry!=0){
            Node node = new Node(carry);
            current.next=node;

        }
        return dummy.next;
    }
    public static Node reverseList(Node head) {
        if(head==null){
            return null;
        }
        Node previous = null;
        Node current = head;
        while(current!=null){
            Node Next = current.next;
            current.next=previous;
            previous=current;
            current=Next;
        }

        return previous;
    }


}
