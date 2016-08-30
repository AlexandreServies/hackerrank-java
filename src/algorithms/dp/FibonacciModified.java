package algorithms.dp;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fibonacciModified(t1, t2, n));
    }

    private static String fibonacciModified(int t1, int t2, int n) {
        BigInteger[] t = new BigInteger[n];
        t[0] = BigInteger.valueOf(t1);
        t[1] = BigInteger.valueOf(t2);
        for (int i = 2; i < n; i++) {
            t[i] = t[i - 2].add(t[i - 1].multiply(t[i - 1]));
        }
        return t[n - 1].toString();
    }
}
