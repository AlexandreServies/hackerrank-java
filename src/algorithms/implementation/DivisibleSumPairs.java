package algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        System.out.println(divisibleSumPairs(a, n, k));
    }

    private static int divisibleSumPairs(int[] a, int n, int k) {
        int nPairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((a[i] + a[j]) % k == 0)
                    nPairs++;
            }
        }
        return nPairs;
    }
}
