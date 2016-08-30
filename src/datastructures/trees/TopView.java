package datastructures.trees;

public class TopView {

    void top_view(Node root) {
        topView(root.left, true);
        System.out.print(root.data + " ");
        topView(root.right, false);
    }

    void topView(Node root, boolean goLeft) {
        if (root != null) {
            if (goLeft) {
                topView(root.left, true);
            }
            System.out.print(root.data + " ");
            if (!goLeft) {
                topView(root.right, false);
            }
        }
    }
}
