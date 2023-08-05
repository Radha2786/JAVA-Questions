package Trees;

public class Client {
    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
        tree.display();
        System.out.println("PRE-ORDER");
        tree.preOrder();
        System.out.println("IN-ORDER");
        tree.inOrder();
        System.out.println("POST-ORDER");
        tree.postOrder();
    }
}
