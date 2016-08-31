package datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<MaxNode> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    int value = sc.nextInt();
                    int currMax = Math.max(value, stack.isEmpty() ? Integer.MIN_VALUE : stack.peek().currentMax);
                    MaxNode item = new MaxNode(value, currMax);

                    stack.push(item);
                    break;
                case 2:
                    if (!stack.isEmpty())
                        stack.pop();
                    break;
                case 3:
                    System.out.println(stack.peek().currentMax);
            }
        }
    }

    static class MaxNode {
        int value;
        int currentMax;

        MaxNode(int value, int currentMax) {
            this.value = value;
            this.currentMax = currentMax;
        }
    }
}
