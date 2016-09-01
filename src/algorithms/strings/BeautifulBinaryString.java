package algorithms.strings;

import java.util.Scanner;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();

        System.out.println((B.length() - B.replaceAll("010", "").length()) / 3);
    }
}
