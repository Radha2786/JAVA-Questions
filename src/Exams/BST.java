package Exams;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node inset(Node root , int data){

//        BASE CONDITION
        if(root == null){
            Node ob = new Node(data);
            return ob;
        }

        if(root.data > data) {
            root.left = inset(root.left, data);
        }
        else{
          root.right = inset(root.right , data);
        }

        return root;
    }

    public static void main(String[] args) {
        int[] Nodes = {4,2,3,1,5,6,9,8,7};
        Node root = null;
        for(int i : Nodes) {
            root = inset(root, i);
        }
        System.out.println(root.data);
        inOrder(root);
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}
