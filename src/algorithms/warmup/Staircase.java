package algorithms.warmup;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        drawStaircase(n);
    }

    private static void drawStaircase(int n) {
        StringBuilder sb = new StringBuilder();
        for (int row = 1; row <= n; row++) {
            for (int i1 = 1; i1 <= n - row; i1++) {
                sb.append(' ');
            }
            for (int i2 = 1; i2 <= row; i2++) {
                sb.append('#');
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
