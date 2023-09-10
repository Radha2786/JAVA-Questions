package Trees_Revision;

import java.util.Scanner;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);

    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    private Node root;
    // constructor of binary tree
    BinaryTree(){
        this.root = CreateBinaryTree();
    }

    private Node CreateBinaryTree(){
        int n = sc.nextInt();
        Node node = new Node(n);
        Boolean Hasleft = sc.nextBoolean();
        if(Hasleft){
            node.left=CreateBinaryTree();
        }
        Boolean HasRight = sc.nextBoolean();
        if(HasRight){
            node.right=CreateBinaryTree();
        }
        return node;
    }

    public int getRoot(){
        return this.root.data;
    }

    // display
    public void display(){
        display(this.root);
    }

    private void display(Node nn){
        if(nn==null){
            return;
        }
        String str = "";

        str=str+nn.data;
        str="<---"+str+"--->";
        if(nn.left!=null){
            str=nn.left.data+str;
        }else{
            str="."+str;
        }
        if(nn.right!=null){
            str=str+nn.right.data;
        }else{
            str=str+".";
        }
        System.out.println(str);
        display(nn.left);
        display(nn.right);
    }
}


