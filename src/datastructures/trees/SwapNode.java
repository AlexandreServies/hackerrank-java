package datastructures.trees;

import java.util.Scanner;

public class SwapNode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTreeFromInput(sc);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();
            performSwap(root, K);
            inOrder(root);
            System.out.println();
        }
    }

    private static void performSwap(Node root, int k) {
        performSwap(root, k, 1);
    }

    private static void performSwap(Node root, int k, int depth) {
        if (root == null)
            return;
        if (depth % k == 0) {
            swapChild(root);
        }
        performSwap(root.left, k, depth + 1);
        performSwap(root.right, k, depth + 1);
    }

    private static void swapChild(Node root) {
        if (root != null) {
            Node tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
    }

    private static Node buildTreeFromInput(Scanner sc) {
        int N = sc.nextInt();
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            Node node = new Node();
            node.data = i + 1;
            nodes[i] = node;
        }
        for (int i = 0; i < N; i++) {
            int leftChild = sc.nextInt();
            int rightChild = sc.nextInt();
            nodes[i].left = leftChild == -1 ? null : nodes[leftChild - 1];
            nodes[i].right = rightChild == -1 ? null : nodes[rightChild - 1];
        }
        return nodes[0];
    }

    static void inOrder(Node root) {
        if (root.left != null) {
            inOrder(root.left);
        }
        System.out.print(root.data + " ");
        if (root.right != null) {
            inOrder(root.right);
        }
    }
}
