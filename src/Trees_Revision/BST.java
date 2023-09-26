package Trees_Revision;

public class BST {
    public class Node{
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BST(int[] arr){

        this.root = createBST(arr,0,arr.length-1);
    }

    public Node createBST(int[] arr,int s,int e){
        if(s>e){
            return null;
        }
        int mid = (s+e)/2;
        Node node = new Node();
        node.data=arr[mid];
        node.left=createBST(arr,s,mid-1);
        node.right = createBST(arr,mid+1,e);
return node;
}
}