package datastructures.trees;

import java.util.LinkedList;

public class LevelOrderTraversal {
    void LevelOrder(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.push(root);
        while (!queue.isEmpty()) {
            Node node = queue.pop();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
