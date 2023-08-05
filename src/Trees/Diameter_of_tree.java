package Trees;

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Diameter_of_tree {

}

//TIME-COMPLEXITY => O(N^2)

//class Solution {
//    public int diameterOfBinaryTree(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//
//        //    DIAMETER OF LEFT SUB TREE
//        int leftDiameter = diameterOfBinaryTree(root.left);
//
//        //    DIAMETER OF RIGHT SUB TREE
//        int rightDiameter = diameterOfBinaryTree(root.right);
//
//        //    CALC SELF DIAMETER
//        int leftSubTreeHeight = height(root.left);
//        int rightSubTreeHeight = height(root.right);
//        int self = leftSubTreeHeight + rightSubTreeHeight + 2;
//
//        return Math.max(self , Math.max(leftDiameter , rightDiameter));
//    }
//
//    private int height(TreeNode root){
//        if(root == null){
//            return -1;
//        }
//
//        int left = height(root.left);
//        int right = height(root.right);
//
//        return Math.max(left , right) + 1;
//    }
//}
