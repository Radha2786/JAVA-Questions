package Exams;

public class BST_Self {
    static class Node{
        int data;
        Node left ;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static Node insert(Node root,int data){
        if(root==null){
            Node ob = new Node(data);
            return ob;
        }else if (root.data>data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;

    }
    // searching
    static Node search(Node root,int key){
        if(root==null || root.data==key){
            return root;
        }else if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }

    // deletion

    public static void main(String[] args) {
        int[] nodes= {4,2,3,1,5,6,9,8,7};
        Node root = null;
        for(int i: nodes){
            root=insert(root,i);
        }
//        System.out.println(root.data);
        Node found=search(root,11);
        System.out.println(found.data);
    }

}
