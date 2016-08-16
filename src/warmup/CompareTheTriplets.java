package warmup;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] a = {a0, a1, a2};
        int[] b = {b0, b1, b2};

        solve(a, b);
    }

    private static void solve(int[] a, int[] b) {
        if (a.length != b.length)
            return;
        int r1 = 0, r2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                r1++;
            }
            if (a[i] < b[i]) {
                r2++;
            }
        }
        System.out.println(r1 + " " + r2);
    }
}
