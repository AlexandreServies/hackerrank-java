package algorithms.strings;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(countWords(s));
    }

    private static int countWords(String s) {
        int nWords = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                nWords++;
            }
        }
        return nWords;
    }
}
