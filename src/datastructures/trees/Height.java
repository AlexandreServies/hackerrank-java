package datastructures.trees;

public class Height {

    int height(Node root) {
        return root == null
                ? -1
                : 1 + Math.max(height(root.left), height(root.right));
    }
}
