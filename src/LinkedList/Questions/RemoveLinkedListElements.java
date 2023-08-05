package LinkedList.Questions;

import LinkedList.LinkedList;
import LinkedList.Node;
import java.util.Scanner;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        LinkedList question = new LinkedList();
//        for (int i = 0 ; i < n ; i++){
//            question.addAtLast(sc.nextInt());
//        }
        question.addAtLast(1);
        question.addAtLast(2);
        question.addAtLast(6);
        question.addAtLast(4);
        question.addAtLast(5);
        question.addAtLast(6);
        Node head = question.getHead();
        Node ans=removeElements(head,6);
        System.out.println(ans.data);

    }
    public static Node removeElements( Node head, int val) {
        Node temp = head;
        Node previous=null;
        Boolean flag=true;
        if(head==null){
            return null;
        }else{
            while(temp!=null){
                while(temp.data==val){
                    if( temp.next!=null){
                        temp.data=temp.next.data;
                        temp.next=temp.next.next;
                    }else{
                        flag=false;
                        break;
                    }

                }
                if(flag==false){
                    break;
                }else {
                    previous=temp;
                    temp = temp.next;
                }

            }

        }
        // System.out.println(temp.val);
        if(temp!=null && temp.data==val){
//            temp=null;
            previous.next=null;
        }
        // System.out.println(temp.val);
        return head;

    }
}
