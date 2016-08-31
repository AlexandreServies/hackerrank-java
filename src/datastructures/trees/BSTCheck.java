package datastructures.trees;

import java.util.Scanner;

public class BSTCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        // Read data values for tree's nodes:
        Tree tree = new Tree();
        while (scanner.hasNext()) {
            tree.values.add(scanner.nextInt());
        }
        scanner.close();

        // Fill tree:
        Node root = new Node();
        tree.inOrder(root, height);

        // Print result:
        System.out.println(checkBST(root) ? "Yes" : "No");

    }

    static boolean checkBST(Node root) {
        return checkBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    static boolean checkBST(Node root, int max, int min) {
        if (root == null) {
            return true;
        } else if (root.left == null && root.right == null) {
            return true;
        } else if (root.left != null && (root.left.data >= root.data || root.left.data <= min)
                || root.right != null && (root.right.data <= root.data || root.right.data >= max)) {
            return false;
        } else {
            return checkBST(root.left, Math.min(max, root.data), min)
                    && checkBST(root.right, max, Math.max(min, root.data));
        }
    }
}
