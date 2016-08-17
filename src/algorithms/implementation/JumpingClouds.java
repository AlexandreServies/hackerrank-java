package algorithms.implementation;

import java.util.Scanner;

public class JumpingClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        System.out.println(minJumpsToWin(c));
    }

    private static int minJumpsToWin(int[] c) {
        int nJumps = 0;
        int n = c.length;
        for (int i = 0; i < n - 1; i++) {
            if (i <= n - 3 && c[i + 2] == 0)
                i++;
            nJumps++;
        }
        return nJumps;
    }
}
