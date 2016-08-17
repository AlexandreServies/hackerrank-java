package algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int S = sc.nextInt();
            System.out.println(deadPrisoner(N, M, S));
        }
    }

    private static int deadPrisoner(int n, int m, int s) {
        int result = (s + (m % n) - 1) % n;
        return result <= 0 ? result + n : result;
    }
}
