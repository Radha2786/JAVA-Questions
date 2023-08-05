package Trees;
import java.util.*;

import java.util.LinkedList;
import java.util.Queue;

// 10 true 20 true 40 true 80 false false false true 50 true 90 false false false true 30 true 60 false false true 70 false true 100 false false
public class Level_Order_Traversal {
    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
//        tree.display();
        Node root = tree.getRoot();      // this getRoot method is non static hence it is called with instance of the class

        List<List<Integer>> list = new ArrayList<>();
        list=LevelOrder(root);
        System.out.println(list);
    }

//    static void LevelOrder(Node root){
//        if(root == null){
//            return;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//
//            Node current = queue.remove();
//
//            System.out.print(current.data + " ");
//
//            if(current.left != null){
//                queue.add(current.left);
//            }
//
//            if(current.right != null){
//                queue.add(current.right);
//            }
//        }
//    }



//    ----------------------------

//    static void LevelOrder(Node root){
//        if(root == null){
//            return;
//        }
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        queue.add(null);
//        while (!queue.isEmpty()){
//            Node current = queue.remove();
//
//            if(current == null){
//                if(queue.isEmpty()){
//                    break;
//                }
//                else {
//                    queue.add(null);
//                    System.out.println();
//                    continue;
//                }
//            }
//
//            System.out.print(current.data + " ");
//
//            if(current.left != null){
//                queue.add(current.left);
//            }
//
//            if(current.right != null){
//                queue.add(current.right);
//            }
//        }
//    }



//    ----------------------
static List<List<Integer>> LevelOrder(Node root) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    List<Integer> ll = new ArrayList<>();
    if(root==null){
        return list;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);
    while(!queue.isEmpty()){
        Node current=queue.remove();
        if(current==null){
            if(queue.isEmpty()){
                break;
            }else{
                queue.add(null);
//                ll.clear();
                list.add(ll);
                ll = new ArrayList<>();
                continue;
            }
        }
        ll.add(current.data);
        System.out.println(ll);
//        list.add(ll);
        System.out.println(list);
        if(current.left != null){
            queue.add(current.left);
        }

        if(current.right != null){
            queue.add(current.right);
        }
    }
//    for(int i=0;i<ll.size();i++){
//        list.add(ll);
//    }
    return list;
}
}
