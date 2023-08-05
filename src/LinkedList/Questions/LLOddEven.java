package LinkedList.Questions;

import LinkedList.LinkedList;
import LinkedList.Node;
import java.util.Scanner;

public class LLOddEven {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        LinkedList even = new LinkedList();
//        LinkedList odd = new LinkedList();
//
//        for(int i=0;i<n;i++){
//            int j=sc.nextInt();
//            list.add(j);
//        }
////        System.out.println(list);
//
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)%2==0){
//                even.addAtLast(list.get(i));
//            }else{
//                odd.addAtLast(list.get(i));
//            }
//        }
//
////        even.display();
//odd.display();
//
//    }

    /*
    6
    1 2 3 4 5 6
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList question = new LinkedList();
        for (int i = 0 ; i < n ; i++){
            question.addAtLast(sc.nextInt());
        }
        Node head = question.getHead();
        even_odd(head);
    }

    static void even_odd(Node head){
        Node even = new Node(-2);
        Node odd = new Node(-1);

        Node evenHead = even;
        Node oddHead = odd;

        while (head != null){
            if(head.data % 2 == 0){
                even.next = head;
                head = head.next;
                even = even.next;
                even.next = null;
            }
            else {
                odd.next = head;
                head = head.next;
                odd = odd.next;
                odd.next = null;
            }
        }

//        display(oddHead);
//        display(evenHead);
//        odd.next = evenHead.next;
//
//        display(oddHead);
//        display(evenHead);
//        evenHead.next = null;
//        Node ans = oddHead.next;
//        oddHead.next = null;
//
//        display(oddHead);
//        display(evenHead);
//        display(ans);

        odd.next = evenHead.next;
        display(oddHead.next);

    }

    static void display(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
