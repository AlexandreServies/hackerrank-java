package datastructures.trees;

public class PreorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void preOrder(Node root) {
        System.out.print(root.data + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }
}
