package algorithms.dp;

import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }
            System.out.println(maxContiguousSum(A) + " " + maxNonContiguousSum(A));
        }
    }

    private static int maxContiguousSum(int[] A) {
        int N = A.length;
        int maxSumEndingAt[] = new int[N];
        maxSumEndingAt[0] = A[0];
        for (int i = 1; i < N; i++) {
            maxSumEndingAt[i] = Math.max(A[i], A[i] + maxSumEndingAt[i - 1]);
        }
        int maxSum = maxSumEndingAt[0];
        for (int i = 0; i < N; i++) {
            maxSum = Math.max(maxSum, maxSumEndingAt[i]);
        }
        return maxSum;
    }

    private static int maxNonContiguousSum(int[] A) {
        int maxNegativeInt = Integer.MIN_VALUE;
        int maxSum = 0;
        for (int n : A) {
            if (n > 0)
                maxSum += n;
            else
                maxNegativeInt = Math.max(maxNegativeInt, n);
        }
        return maxSum > 0 ? maxSum : maxNegativeInt;
    }
}
