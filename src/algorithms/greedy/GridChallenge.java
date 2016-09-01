package algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            char[][] grid = new char[N][N];
            for (int j = 0; j < N; j++) {
                char[] line = sc.next().toCharArray();
                Arrays.sort(line);
                grid[j] = line;
            }
            System.out.println(isSorted(grid) ? "YES" : "NO");
        }
    }

    private static boolean isSorted(char[][] grid) {
        int N = grid.length;
        for (int i = 0; i < N; i++) {
            char previous = grid[0][i];
            for (int j = 1; j < N; j++) {
                char c = grid[j][i];
                if (c < previous) {
                    return false;
                }
                previous = c;
            }
        }
        return true;
    }
}
