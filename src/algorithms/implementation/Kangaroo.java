package algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        boolean canMeet = canMeet(x1, v1, x2, v2);

        System.out.println(canMeet ? "YES" : "NO");
    }

    private static boolean canMeet(int x1, int v1, int x2, int v2) {
        return v1 > v2
                && (x2 - x1) % (v2 - v1) == 0;
    }
}
