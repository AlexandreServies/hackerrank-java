package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            System.out.println(nUniqueChars(s));
        }
    }

    private static int nUniqueChars(String s) {
        int result = 0;
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                result++;
            }
        }
        return result;
    }
}
