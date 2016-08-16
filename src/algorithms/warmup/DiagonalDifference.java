package algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }

        System.out.println(diagonalDifference(a));
    }

    private static int diagonalDifference(int[][] a) {
        int N = a.length; //Assuming a is always a square matrix
        int d1 = 0, d2 = 0;
        for (int i = 0; i < N; i++) {
            d1 += a[i][i];
            d2 += a[i][N - 1 - i];
        }
        return Math.abs(d1 - d2);
    }
}
