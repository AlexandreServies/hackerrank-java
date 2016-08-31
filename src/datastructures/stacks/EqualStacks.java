package datastructures.stacks;

import java.util.LinkedList;
import java.util.Scanner;

public class EqualStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        HeightStack s1 = new HeightStack();
        HeightStack s2 = new HeightStack();
        HeightStack s3 = new HeightStack();

        for (int i = 0; i < n1; i++) {
            int cylinder = sc.nextInt();
            s1.add(cylinder);
        }
        for (int i = 0; i < n2; i++) {
            int cylinder = sc.nextInt();
            s2.add(cylinder);
        }
        for (int i = 0; i < n3; i++) {
            int cylinder = sc.nextInt();
            s3.add(cylinder);
        }

        System.out.println(maxEqualHeight(s1, s2, s3));
    }

    private static int maxEqualHeight(HeightStack s1, HeightStack s2, HeightStack s3) {
        while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
            if (s1.height == s2.height && s2.height == s3.height) {
                return s1.height;
            }
            int top1 = s1.height - s1.peek();
            int top2 = s2.height - s2.peek();
            int top3 = s3.height - s3.peek();
            if (top1 >= top2) {
                if (top1 >= top3) {
                    s1.pop();
                } else {
                    s3.pop();
                }
            } else {
                if (top2 >= top3) {
                    s2.pop();
                } else {
                    s3.pop();
                }
            }
        }
        return 0;
    }

    static class HeightStack {
        int height = 0;
        LinkedList<Integer> stack = new LinkedList<>();

        public Integer add(Integer item) {
            stack.add(item);
            height += item;
            return item;
        }

        public Integer pop() {
            Integer pop = stack.pop();
            height -= pop;
            return pop;
        }

        public Integer peek() {
            return stack.peek();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }
}
