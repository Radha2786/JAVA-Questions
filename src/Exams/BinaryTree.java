package Exams;

public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static int index = -1;
    Node constructBinaryTree(int[] Nodes){
        index++;
        if(Nodes[index] == -1){
            return null;
        }

        Node ob = new Node(Nodes[index]);
//        LEFT PRR INSERT KARENGE
        ob.left = constructBinaryTree(Nodes);
//        RIGHT PRR INSERT KARENGE
        ob.right = constructBinaryTree(Nodes);

        return ob;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree ob = new BinaryTree();
        Node root = ob.constructBinaryTree(nodes);

//        System.out.println(root.data);
//        System.out.println(root.left.data);

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
    static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    static void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    // height of tree
    static int Height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        return Math.max (leftHeight,rightHeight)+1;
    }

    // count nodes of tree
    static int CountNodes(Node root){
        if(root== null){
            return 0;
        }
        int leftNodesCount = CountNodes(root.left);
        int rightNodesCount = CountNodes(root.right);
        return leftNodesCount+rightNodesCount+1;
    }
    // sum of nodes
    static int SumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int LeftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);
        return LeftSum+ rightSum+ root.data;
    }
}
