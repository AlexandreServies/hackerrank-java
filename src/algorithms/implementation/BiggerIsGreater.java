package algorithms.implementation;

import java.util.Scanner;

public class BiggerIsGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(nextPermutation(sc.nextLine()));
        }
    }


    private static String nextPermutation(String s) {
        char[] array = s.toCharArray();
        int i = array.length - 1;
        //find last index where a[i-1] < a[i]
        while (i > 0 && array[i - 1] >= array[i])
            i--;

        //No such i = string already biggest lexicographic permutation
        if (i <= 0)
            return "no answer";

        //find j > i for which a[j] - a[i] is minimal
        int j = array.length - 1;
        while (array[j] <= array[i - 1])
            j--;

        //switch a[i-1] and a[j]
        char temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        //reverse a[i:]
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return new String(array);
    }
}
