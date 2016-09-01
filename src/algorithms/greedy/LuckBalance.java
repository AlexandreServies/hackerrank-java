package algorithms.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;
        List<Integer> importantContests = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int luck = sc.nextInt();
            if (sc.nextInt() == 0) {
                result += luck;
            } else {
                importantContests.add(luck);
            }
        }

        importantContests.sort(Comparator.reverseOrder());
        for (int i = 0; i < Math.min(importantContests.size(), K); i++) {
            result += importantContests.get(i);
        }
        for (int i = K; i < importantContests.size(); i++) {
            result -= importantContests.get(i);
        }
        System.out.println(result);
    }
}
