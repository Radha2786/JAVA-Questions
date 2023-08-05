package Trees;

import java.util.Scanner;

// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

public class Binary_Tree {

    private Node root;
    static Scanner sc = new Scanner(System.in);

    public Node getRoot(){

        return this.root;
    }

    public Binary_Tree(){
        this.root = createBinaryTree();
    }
    private Node createBinaryTree() {

        int n = sc.nextInt();

        Node node = new Node(n);

        boolean hasLeftChild = sc.nextBoolean();

        if(hasLeftChild){
            node.left = createBinaryTree();
        }

        boolean hasRightChild = sc.nextBoolean();

        if(hasRightChild){
            node.right = createBinaryTree();
        }
        return node;
    }

    public void display(){
        print(this.root);
    }
    private void print(Node root){
        if(root == null){
            return;
        }

        String current = "" + root.data;

        if(root.left != null){
            current = root.left.data + " <= " + current;
        }
        else{
            current = "NULL"+ " <= " + current;
        }

        if(root.right != null){
            current = current + " => " + root.right.data;
        }
        else{
            current = current + " => " + "NULL";
        }

        System.out.println(current);

        print(root.left);
        print(root.right);
    }

    public void preOrder(){
        PreOrder(this.root);
        System.out.println();
    }

    private void PreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");

        PreOrder(root.left);
        PreOrder(root.right);
    }

    public void postOrder(){
        PostOrder(this.root);
        System.out.println();
    }

    private void PostOrder(Node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);

        System.out.print(root.data + " ");
    }

    public void inOrder(){
        InOrder(this.root);
        System.out.println();
    }
    private void InOrder(Node root){
        if(root == null){
            return;
        }

        InOrder(root.left);

        System.out.print(root.data + " ");

        InOrder(root.right);
    }
}
