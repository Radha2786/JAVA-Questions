package Practice;

public class MyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    private Node head=null;
    private Node tail=null;
    private int size ;

    public void addAtfirst(int data){
        if(this.size==0){
            Node node  = new Node(data);
            this.head=node;
            this.tail=node;
            size++;
            return;
        }
        Node node  = new Node(data);
        node.next=head;
        this.head=node;
        this.size++;

    }

    public void addAtLast(int data){
        if(this.size==0){
            Node node  = new Node(data);
            this.head=node;
            this.tail=node;
            size++;
            return;
        }
        Node node  = new Node(data);
        this.tail.next=node;
        this.tail=node;
        this.size++;

    }

    public void addAtIndex(int data,int index) throws Exception {
        if(index<0 || index >size){
            throw new Exception("index glt hai chutiye");
        }else if (index==0){
            addAtfirst(data);
        }else if(index==size){
            addAtLast(data);
        }else{
            Node node  = new Node(data);
            Node position=getNode(index);
            Node previous = getNode(index-1);
            previous.next=node;
            node.next=position;
            this.size++;

        }

    }

    public int removeFirst(){
        Node removed_node = this.head;
        this.head=this.head.next;
        removed_node.next=null;
        this.size--;
        return removed_node.data;
    }

    public int removeLast() throws Exception {
        Node removed_node = this.tail;
        Node previous = getNode(size-2);
        this.tail=previous;
        previous.next=null;
        this.size--;
        return removed_node.data;


    }


    public int removefromindex(int index) throws Exception {
        Node position = getNode(index);
        Node previous = getNode(index-1);
        previous.next=previous.next.next;
        position.next=null;
        this.size--;
        return position.data;


    }
    public Node getNode(int k) throws Exception {
        if(k<0 || k>size){
            throw new Exception("index glt hai chutiye");
        }else{
            Node temp = this.head;
            for(int i=1;i<=k;i++){
                temp=temp.next;
            }
            return temp;
        }
    }

    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
}
