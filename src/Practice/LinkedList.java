package Practice;

public class LinkedList {

    public class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    private Node Head;
    private Node Tail;
    private int size ;

    // insertion at starting
    public void Addatstart(int data){
        if(this.size==0){
            Node ob = new Node(data);
            this.Head = ob;
            this.Tail=ob;
            this.size++;
            return;
        }
        Node node = new Node(data);
        node.next=this.Head;
        this.Head=node;
        this.size++;
    }

    // insertion at last

    public void AddatLast(int data){
        if(this.size==0){
            Addatstart(data);
            return ;
        }
        Node node = new Node(data);
        this.Tail.next=node;
        this.Tail=node;
        this.size++;
    }

    public int getIndex(int k) throws Exception {
        return getNode(k).data;
    }



    public void Addatindex(int data,int index) throws Exception {
        if(index==0){
            Addatstart(data);
        }else if(index==size){
            AddatLast(data);
        }else{
            if(index<0 || index>size){
                throw new Exception("index glt hai chutiye baklol");
            }else{
                Node node = new Node(data);
                Node position=getNode(index);
                Node previous = getNode(index-1);
//                previous.next=node;
//                node.next=position;
                node.next =previous.next;
                previous.next=node;
                this.size++;


            }
        }

    }

    private Node getNode(int k) throws Exception {
        if(k<0 || k>=size){
            throw new Exception("index out bound chutiye");
        }
        Node temp=this.Head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
//        System.out.println(temp.data);
        return temp;
    }

    public Node getFirst(){
        return this.Head;
    }
    public Node getlast(){
        return this.Tail;
    }


    // Remove

    public int RemoveFirst(){
        Node removed_node = this.Head;
        this.Head=Head.next;
        removed_node.next=null;
        this.size--;
        return removed_node.data;
    }
    public int Removelast() throws Exception {
        Node removed_node = this.Tail;
        Node previous=getNode(size-2);
        this.Tail=previous;
        Tail.next=null;
        this.size--;
        return removed_node.data;
    }

    public int RemoveatIndex(int k) throws Exception {
        if(k<0 || k>=size){
            throw new Exception("k ki range glt h chaman");
        }
        Node temp=getNode(k);
        Node previous = getNode(k-1);
        previous.next=previous.next.next;
        temp.next=null;
        this.size--;
        return temp.data;
    }

    public void display(){
        Node temp=this.Head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println();
    }
}
