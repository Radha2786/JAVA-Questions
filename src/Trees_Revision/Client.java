package Trees_Revision;

public class Client {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.getRoot());
        tree.display();
        System.out.println("--------------------------------------");
        tree.Preorder();
        System.out.println("Inorder");
        tree.Inorder();
        System.out.println("Postorder");
        tree.Postorder();
    }
}
