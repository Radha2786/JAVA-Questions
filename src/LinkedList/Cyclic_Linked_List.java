package LinkedList;



public class Cyclic_Linked_List {
    public static void main(String[] args) {
        LinkedList list =  new LinkedList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.display();

        Node Head = list.getHead();
        Node Tail = list.getTail();

        Tail.next = Head;

        list.display();
    }
}
