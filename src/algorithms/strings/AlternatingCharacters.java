package algorithms.strings;

import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            int nDeletions = getNDeletions(s);
            System.out.println(nDeletions);
        }
    }

    private static int getNDeletions(String s) {
        char previous = s.charAt(0);
        int nDeletions = 0;
        for (int j = 1; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == previous) {
                nDeletions++;
            }
            previous = c;
        }
        return nDeletions;
    }
}
