package LinkedList.Questions;

import LinkedList.LinkedList;

import LinkedList.Node;

public class Intersection_of_ll {
    public static void main(String[] args) {
        LinkedList question = new LinkedList();
        LinkedList question2 = new LinkedList();
        question.addAtLast(2);
        question.addAtLast(6);
        question.addAtLast(4);
        question2.addAtLast(1);
        question2.addAtLast(5);
//        question2.addAtLast(6);
        Node headA = question.getHead();
        Node headB = question2.getHead();
        Node ans=Intersection(headA,headB);
        System.out.println(ans);
    }
    public static Node Intersection(Node headA, Node headB) {
        Node tempA=headA;
        Node tempB=headB;
        while(tempA!=tempB){
            if(tempA==null){
                tempA=headB;
            }else{
                tempA=tempA.next;
            }
            if(tempB==null){
                tempB=headA;
            }else{
                tempB=tempB.next;
            }


        }
        return tempA;
    }
}
