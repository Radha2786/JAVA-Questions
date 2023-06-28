package Practice;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.Addatstart(10);
        ll.Addatstart(20);
        ll.Addatstart(30);
//        ll.display();
        ll.AddatLast(40);
        ll.AddatLast(50);
//        ll.getNode(2);
        ll.display();
//        ll.RemoveFirst();
//        ll.display();
//        ll.Removelast();
//        ll.display();
//        System.out.println(ll.RemoveatIndex(3));
        ll.Addatindex(100,2);
        ll.display();
    }
}
