package algorithms.warmup;

import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            solve(A, n, k, sc.nextInt());
        }
    }

    private static void solve(int[] a, int n, int k, int m) {
        int index = (m - k)%n;
        index = index >= 0
                ? index
                : index + n;
        System.out.println(a[index]);
    }
}
