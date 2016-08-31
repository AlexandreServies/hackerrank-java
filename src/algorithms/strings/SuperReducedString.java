package algorithms.strings;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reduce(s));
    }

    private static String reduce(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        Object[] chars = stack.toArray();
        StringBuilder sb = new StringBuilder();
        for (Object aChar : chars) {
            sb.append((char) aChar);
        }
        String result = sb.toString();
        return result.isEmpty() ? "Empty String" : result;
    }
}
