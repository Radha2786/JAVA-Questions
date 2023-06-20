package LinkedList;

public class Client {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addAtLast(10);
        ll.addAtLast(20);
        ll.addAtLast(30);
        ll.addAtStarting(5);
        ll.addAtLast(40);
//        ll.display();
//        ll.addAtIndex(1, 0);
//        ll.display();
//        ll.addAtIndex(50 , 6);
//        ll.display();
        ll.addAtIndex(100 , 2);
        ll.display();

//        System.out.println(ll.deleteFromLast());
//        ll.display();
//        System.out.println(ll.deleteFromLast());
//        ll.display();
//        System.out.println(ll.deleteFromLast());
//        ll.display();
//        System.out.println(ll.deleteFromLast());
//        ll.display();
//        System.out.println(ll.deleteFromLast());
//        ll.display();
//        System.out.println(ll.deleteFromLast());
//        ll.display();

        System.out.println(ll.deleteAtIndex(2));
        ll.display();
    }
}
