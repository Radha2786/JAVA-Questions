package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}


public class LinkedList {
    private Node Head;
    private Node Tail;
    private int size;

    /**
        INSERTIONS
     **/


//    INSERTING AT THE END OF LINKED-LIST
    public void addAtLast(int data){
        if(this.size == 0){
            Node node = new Node(data);
            this.Head = node;
            this.Tail = node;
            this.size++;
            return;
        }

        Node node = new Node(data);
        Tail.next = node;
        this.Tail = this.Tail.next;
        this.size++;
    }

//    INSERTING AT THE STARTING OF THE LINKED-LIST
    public void addAtStarting(int data){
        if(this.size == 0){
            Node node = new Node(data);
            this.Head = node;
            this.Tail = node;
            this.size++;
            return;
        }

        Node node = new Node(data);
        node.next = this.Head;
        this.Head = node;

        this.size++;
    }

//    INSERTING AT ANY INDEX

    public void addAtIndex(int data , int index) throws Exception {
        if(index == 0){
            addAtStarting(data);
            return;
        }
        if(index == this.size){
            addAtLast(data);
            return;
        }

        Node previous = GET(index-1);

        Node node = new Node(data);
        node.next = previous.next;

        previous.next = node;

        this.size++;
    }

    public int get(int k) throws Exception {
        return GET(k).data;
    }

    private Node GET(int k) throws Exception {
        if(k < 0 || k >= this.size){
            throw new Exception("BAKLOL GALAT INDEX HAI!!!");
        }
        Node temp = this.Head;

        for (int i = 1 ; i <= k ; i++){
            temp = temp.next;
        }

        return temp;
    }

    /**
        REMOVAL
     **/

//    DELETE FROM FIRST

    public int deleteFromFirst() throws Exception {
        if(this.size == 0){
            throw new Exception("LINKED-LIST IS EMPTY!!");
        }

        if(this.Head == this.Tail){
            int deleted_data = this.Tail.data;
            this.Head = this.Tail = null;
            this.size--;

            return deleted_data;
        }

        Node temp = this.Head;
        this.Head = this.Head.next;

        temp.next = null;

        this.size-- ;
        return temp.data;
    }

//    DELETE FROM LAST
    public int deleteFromLast() throws Exception {
        if(this.size == 0){
            throw new Exception("LINKED-LIST IS EMPTY!!");
        }

        if(this.Head == this.Tail){
            int deleted_data = this.Tail.data;
            this.Head = this.Tail = null;
            this.size--;

            return deleted_data;
        }

        Node temp = GET(this.size - 2);
        this.Tail = temp;
        int deleted_value = this.Tail.next.data;
        this.Tail.next = null;

        this.size--;
        return deleted_value;
    }

    public int deleteAtIndex(int index) throws Exception {
        if(index == 0){
            return deleteFromFirst();
        }

        if(index == this.size-1){
            return deleteFromLast();
        }

        Node previous = GET(index-1);
        Node temp = previous.next;

//        previous.next = temp.next;
        previous.next = previous.next.next;

        temp.next = null;
        return temp.data;
    }

    public int getSize(){
        return this.size;
    }

    public Node getHead(){
        return this.Head;
    }

    public Node getTail(){
        return this.Tail;
    }

    public void display(){
        Node temp = this.Head;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}
