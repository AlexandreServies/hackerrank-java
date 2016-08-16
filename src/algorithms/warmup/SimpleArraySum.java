package algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        System.out.println(arraySum(arr));
    }

    public static int arraySum(int[] arr) {
        int res = 0;
        for (int n : arr) {
            res += n;
        }
        return res;
    }
}
