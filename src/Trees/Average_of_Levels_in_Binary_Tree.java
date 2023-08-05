package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree {
    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
//        tree.display();
        Node root = tree.getRoot();
        ArrayList<Double> list = new ArrayList<>();
        Average(root,list);
        System.out.println(list);

    }
    static void Average(Node root,ArrayList<Double>list){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int ans=0;
        double avg=0;
        int count=0;
        while (!queue.isEmpty()){
            Node current = queue.remove();

            if(current == null){
                if(queue.isEmpty()){
                    break;
                }
                else {
                    queue.add(null);
                    avg=ans/count;
                    list.add(avg);
                    System.out.println();
                    ans=0;
                    count=0;
                    continue;
                }
            }

//            System.out.print(current.data + " ");
            ans+=current.data;
            count++;
            if(current.left != null){
                queue.add(current.left);
            }

            if(current.right != null){
                queue.add(current.right);
            }
        }
    }
}
