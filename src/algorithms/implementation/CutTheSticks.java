package algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        cutTheSticks(arr, n);
    }

    private static void cutTheSticks(int[] A, int n) {
        Arrays.sort(A);
        int totalCut = A[0];
        int remainingSticks = n;
        int toRemove = 0;
        for (int element : A) {
            if (element > totalCut) {
                System.out.println(remainingSticks);
                remainingSticks -= toRemove;
                toRemove = 1;
            }
            if (element <= totalCut) {
                toRemove++;
            }
            totalCut = Math.max(totalCut, element);
        }
        System.out.println(remainingSticks);
    }
}
