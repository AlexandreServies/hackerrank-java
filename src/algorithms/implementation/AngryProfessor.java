package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int nOnTime = 0;
            for (int a_i = 0; a_i < n; a_i++) {
                if (in.nextInt() <= 0)
                    nOnTime++;
            }
            boolean classCancelled = nOnTime < k;
            System.out.println(classCancelled ? "YES" : "NO");
        }
    }
}
