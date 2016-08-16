package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        solve(arr);
    }

    private static void solve(int[] arr) {
        int plus = 0, minus = 0, zero = 0;
        int N = arr.length;
        for (int n : arr) {
            if (n > 0) {
                plus++;
            } else if (n < 0) {
                minus++;
            } else {
                zero++;
            }
        }
        System.out.println((double) plus / N);
        System.out.println((double) minus / N);
        System.out.println((double) zero / N);
    }
}
