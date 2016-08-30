package datastructures.trees;

public class BSTInsertion {
    static Node Insert(Node root, int value) {
        if (root == null)
            root = createNewNode(value);
        else {
            insertRecursive(root, value);
        }
        return root;
    }

    private static void insertRecursive(Node root, int value) {
        if (value < root.data) {
            if (root.left == null) {
                root.left = createNewNode(value);
            } else {
                Insert(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.left = createNewNode(value);
            } else {
                Insert(root.right, value);
            }
        }
    }

    private static Node createNewNode(int value) {
        Node node = new Node();
        node.data = value;
        return node;
    }
}
