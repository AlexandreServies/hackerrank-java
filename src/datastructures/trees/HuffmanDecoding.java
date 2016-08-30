package datastructures.trees;

public class HuffmanDecoding {
    void decode(String S, Node root) {
        Node currentNode = root;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '0') {
                currentNode = currentNode.left;
            } else if (c == '1') {
                currentNode = currentNode.right;
            }
            if (currentNode.data != '\0') {
                System.out.print(currentNode.data);
                currentNode = root;
            }
        }
    }
}
