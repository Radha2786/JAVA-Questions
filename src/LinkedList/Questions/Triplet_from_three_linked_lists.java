package LinkedList.Questions;

import LinkedList.LinkedList;

import java.util.Scanner;
import LinkedList.Node;

public class Triplet_from_three_linked_lists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        LinkedList l3 = new LinkedList();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k= sc.nextInt();
        for(int i=1;i<=n;i++){
            l1.addAtLast(sc.nextInt());
        }
        for (int j=1;j<=n;j++){
            l2.addAtLast(sc.nextInt());
        }
        for (int i=1;i<=n;i++){
            l3.addAtLast(sc.nextInt());
        }
        int target = sc.nextInt();
        Node head1 = l1.getHead();
        Node head2 = l2.getHead();
        Node head3 = l3.getHead();
        sum(head1,head2,head3,target);
    }
    public static void sum(Node head1, Node head2, Node head3,int target){
        Node temp1=head1;


        while(temp1!=null){
            Node temp2=head2;
            while(temp2!=null){
                Node temp3 = head3;
                while(temp3!=null){
                    if(temp1.data+ temp2.data+ temp3.data==target){
                        System.out.println(temp1.data+" "+ temp2.data+" "+ temp3.data);
                        return;
                    }else{
                        temp3=temp3.next;
                    }
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }

    }
}
