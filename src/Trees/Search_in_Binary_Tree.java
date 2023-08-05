package Trees;

import java.util.Scanner;

public class Search_in_Binary_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_Tree tree = new Binary_Tree();
        Node root = tree.getRoot();
        int target = sc.nextInt();
        System.out.println(search(root , target));
    }
    static boolean search(Node root , int target){
//        if(root==null){
//            return false;
//        }
//        if(root.data==target){
//            return true;
//        }
//        ans=search(root.left,target);
//
//        ans=search(root.right,target);
//        return ans;

        if(root == null){
            return false;
        }

        if(root.data == target){
            return true;
        }

//        boolean left = search(root.left , target);
//        if(left){
//            return true;
//        }
//
//        return search(root.right , target);

        boolean left = search(root.left , target);
        boolean right = search(root.right , target);

        return left || right;

        // WRITE YOUR CODE HERE
    }
}
